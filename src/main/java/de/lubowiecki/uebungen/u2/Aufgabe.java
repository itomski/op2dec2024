package de.lubowiecki.uebungen.u2;

import java.util.Arrays;

public class Aufgabe {

    // Aufgabe 1
    // Schreibe eine Utility-Klasse für einen Würfelbecher
    // Er soll zwei Methoden enthalten:
    // eine für einen einzigen Würfelwurf mit einem 6-Seitigen Würfel
    // eine für einen Würfelwurf mit mehreren 6-Seitigen Würfeln. Anzahl wird als Parameter vorgegeben
    // Beide Methoden sollen die Werte zurückgeben und nicht selbst auf der Konsole ausgeben

    // Aufgabe 2
    // Schreibe eine Taschenrechner-Klasse mit den 4 Grundrechenarten für double Werte
    // Die Methoden sollen bei der Ausführung die Aktion in ein Protokoll schreiben
    // z.B. bei add(10, 22) wird "10 + 22 = 32" ins Protokoll geschrieben.
    // Der Taschenrechner soll als Singleton umgesetzt werden, so dass man sich jederzeit alle
    // vergangenen Methoden-Aufrufe anschauen kann.
    // mit der Methode clear() kann das Protokoll geleert werden

    public static void main(String[] args) {

        Calculator calculator = Calculator.getInstance();
        calculator.add(10, 15);
        calculator.add(10, 27);
        calculator.add(10, 15);
        System.out.println(calculator.getProtokoll());
        calculator.clear();
        System.out.println(calculator.getProtokoll());


    }
}
