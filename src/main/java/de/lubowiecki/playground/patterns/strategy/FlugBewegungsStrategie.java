package de.lubowiecki.playground.patterns.strategy;

public class FlugBewegungsStrategie implements BewegungsStrategie {
    @Override
    public void move() {
        System.out.println("Ich fliege durch die Gegend...");
    }
}