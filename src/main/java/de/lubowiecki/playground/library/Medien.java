package de.lubowiecki.playground.library;

import java.util.Scanner;

// UtilityKlasse
public class Medien {

    private Medien() {
    }

    public static Medium createMedium(Scanner scanner, String medium) {
        if(medium.equals("buch"))
            return createBuch(scanner);
        else if(medium.equals("zeitschrift"))
            return createZeitschrift(scanner);
        else if(medium.equals("video"))
            return createVideo(scanner);

        throw new RuntimeException("Falsche Auswahl!");
    }

    // Klassenmethoden
    private static Buch createBuch(Scanner scanner) {
        Buch b = new Buch();
        System.out.print("Titel: ");
        b.setTitel(scanner.nextLine());
        System.out.print("Autor: ");
        b.setAutor(scanner.nextLine());
        System.out.print("Seiten: ");
        b.setAnzahlSeiten(scanner.nextInt());
        System.out.print("Erscheinungsjahr: ");
        b.setErscheinungsJahr(scanner.nextInt());
        scanner.nextLine(); // fix
        return b;
    }

    private static Zeitschrift createZeitschrift(Scanner scanner) {
        throw new UnsupportedOperationException("Noch nicht eingebaut");
    }

    private static Video createVideo(Scanner scanner) {
        throw new UnsupportedOperationException("Noch nicht eingebaut");
    }
}
