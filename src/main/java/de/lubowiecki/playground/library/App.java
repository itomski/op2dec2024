package de.lubowiecki.playground.library;

import javax.swing.text.View;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final String FILE = System.getProperty("user.home") + "/media-data.ser";

    private List<Medium> medien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // (static) Klassenmethode - dürfen nur statische Methoden und statische Eigenschaften benutzen
    public static void main(String[] args) {
        new App().start(); // Wechsel vom statischen auf Instanzkontext
    }

    public App() {
        loadFromFile(); // Daten werden beim Start der App aus der Datei geladen
    }

    public void start() {

        app: while(true) {
            System.out.print("Eingabe: ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Bei Referenztypen:
            // == ist es das gleiche Objekt auf dem Heap?
            // equals hat es den gleichen Inhalt?

            switch(input) {
                case "exit" -> { break app; }
                case "new" -> createNew();
                case "all" -> showAll();
                default -> System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Programmende");
    }

    // Instanzmethode
    private void createNew() {

        System.out.print("Welches Medium? ");
        String auswahl = scanner.nextLine().trim().toLowerCase();

        try {
            medien.add(Medien.createMedium(scanner, auswahl));
            System.out.println("Gespeichert!");
            saveToFile(); // Nach jeder Änderung wird gespeichert
        }
        catch (RuntimeException e) {
            System.out.println("Falsche auswahl!");
        }
    }

    private void showAll() {
        for(Medium m : medien) {
            System.out.println(m.getInfoFull());
        }
    }

    private void saveToFile() {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(medien);
        }
        catch (IOException e) {
            System.out.println("Fehler! Daten konnten nicht gespeichert werden!");
        }
    }

    private void loadFromFile() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            medien = (List<Medium>) in.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Fehler! Daten konnten nicht geladen werden!");
        }
    }
}
