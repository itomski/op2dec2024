package de.lubowiecki.playground.patterns.strategy;

public abstract class Roboter {

    private BewegungsStrategie bewegungsStrategie;
    private ArbeitsStrategie arbeitsStrategie;

    public Roboter(BewegungsStrategie bewegungsStrategie, ArbeitsStrategie arbeitsStrategie) {
        this.bewegungsStrategie = bewegungsStrategie;
        this.arbeitsStrategie = arbeitsStrategie;
    }

    public void work() {
        arbeitsStrategie.work();
    }

    public void move() {
        bewegungsStrategie.move();
    }
}
