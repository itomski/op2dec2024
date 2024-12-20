package de.lubowiecki.playground.patterns.strategy;

public class FahrBewegungsStrategie implements BewegungsStrategie {


    @Override
    public void move() {
        System.out.println("Ich fahre rum...");
    }
}
