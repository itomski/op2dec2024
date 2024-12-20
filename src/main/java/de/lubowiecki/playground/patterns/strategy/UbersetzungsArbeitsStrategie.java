package de.lubowiecki.playground.patterns.strategy;

public class UbersetzungsArbeitsStrategie implements ArbeitsStrategie {
    @Override
    public void work() {
        System.out.println("Ich übersetze");
    }
}
