package de.lubowiecki.playground.patterns.strategy;

public class ForschungArbeitsStrategie implements ArbeitsStrategie {
    @Override
    public void work() {
        System.out.println("Ich forsche");
    }
}