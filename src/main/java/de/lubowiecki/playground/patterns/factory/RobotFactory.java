package de.lubowiecki.playground.patterns.factory;

public class RobotFactory {

    public Robot create(String name) {
        return create(name, BotType.NORMAL);
    }

    public Robot create(String name, BotType type) {
        return switch(type) {
            case NORMAL -> new Robot(0, 0, name);
            case HAUSHALT -> new HaushaltRobot(0, 0, name, "Staubsaugen");
            default -> throw new RuntimeException("Keine passende Auswahl!");
        };
    }
}