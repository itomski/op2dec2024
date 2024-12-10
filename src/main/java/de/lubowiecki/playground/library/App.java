package de.lubowiecki.playground.library;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // Eine Bibliothek kann viele unterschiedliche Medien aufnehmen
    // Es können Medien hinzugefügt werden
    // Es können alle Medien angezeigt werden
    // Es können Medien nach ihrer Art angezeigt werden

    private List<Medium> medien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // (static) Klassenmethode - dürfen nur statische Methoden und statische Eigenschaften benutzen
    public static void main(String[] args) {
        new App().start(); // Wechsel vom statischen auf Instanzkontext
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
                case "buch" -> showSelected("buch");
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

    private void showSelected(String selection) {
        throw new UnsupportedOperationException("Noch nicht eingbaut!");
//        for(Medium m : medien) {
//            if(m instanceof selection)
//                System.out.println(m);
//        }
    }
}
