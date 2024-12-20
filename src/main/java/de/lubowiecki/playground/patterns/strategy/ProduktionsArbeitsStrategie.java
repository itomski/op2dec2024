package de.lubowiecki.playground.patterns.strategy;

public class ProduktionsArbeitsStrategie implements ArbeitsStrategie {
    @Override
    public void work() {
        System.out.println("Ich produziere");
    }
}
