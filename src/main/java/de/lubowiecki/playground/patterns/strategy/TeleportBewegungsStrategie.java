package de.lubowiecki.playground.patterns.strategy;

public class TeleportBewegungsStrategie implements BewegungsStrategie {


    @Override
    public void move() {
        System.out.println("Ich teleportiere mich");
    }
}
