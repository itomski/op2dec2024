package de.lubowiecki.playground.patterns.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        // Roboter r2d2 = new ForschungsRoboter();
        Roboter r2d2 = new IndustrieRoboter();
        r2d2.work();
        r2d2.move();

    }
}
