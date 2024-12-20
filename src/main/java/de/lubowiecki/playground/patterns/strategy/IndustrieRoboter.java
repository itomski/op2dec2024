package de.lubowiecki.playground.patterns.strategy;

public class IndustrieRoboter extends Roboter {
    public IndustrieRoboter() {
        super(new FahrBewegungsStrategie(), new ProduktionsArbeitsStrategie());
    }
}
