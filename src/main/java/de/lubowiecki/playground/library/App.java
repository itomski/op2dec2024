package de.lubowiecki.playground.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // Eine Bibliothek kann viele unterschiedliche Medien aufnehmen
    // Es können Medien hinzugefügt werden
    // Es können alle Medien angezeigt werden
    // Es können Medien nach ihrer Art angezeigt werden

    private List<Buch> medien = new ArrayList<>();
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

            System.out.println(input);
        }

        System.out.println("Programmende");
    }

    // Instanzmethode
    private void createNew() {
        // TODO: Neues Medium
    }

    private void showAll() {
        // TODO: Alle Medien anzwigen
    }

    private void showSelected(String selection) {
        // TODO: Nur Bücher anzeigen
    }
}
