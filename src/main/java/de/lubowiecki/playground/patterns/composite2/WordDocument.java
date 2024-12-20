package de.lubowiecki.playground.patterns.composite2;

public class WordDocument implements Printable {

    public void printWord() {
        System.out.println("Word-Doc wir gedruckt...");
    }

    @Override
    public void print() {
        printWord();
    }
}
