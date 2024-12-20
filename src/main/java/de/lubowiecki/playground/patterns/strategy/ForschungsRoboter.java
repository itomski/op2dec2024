package de.lubowiecki.playground.patterns.strategy;

public class ForschungsRoboter extends Roboter {

    public ForschungsRoboter() {
        super(new FlugBewegungsStrategie(), new ForschungArbeitsStrategie());
    }
}
