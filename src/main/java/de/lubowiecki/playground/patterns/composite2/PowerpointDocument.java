package de.lubowiecki.playground.patterns.composite2;

public class PowerpointDocument implements Printable{

    public void printPowerpoint() {
        System.out.println("Präsi wir gedruckt...");
    }


    @Override
    public void print() {
        printPowerpoint();
    }
}
