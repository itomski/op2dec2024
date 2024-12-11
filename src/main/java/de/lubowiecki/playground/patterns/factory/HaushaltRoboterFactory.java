package de.lubowiecki.playground.patterns.factory;

public class HaushaltRoboterFactory extends RobotFactory {

    @Override
    public Robot create(String name) {
        return super.create(name, BotType.HAUSHALT);
    }

    @Override
    public Robot create(String name, BotType type) {
        // throw new UnsupportedOperationException("Wird nicht mehr unterstützt");
        return super.create(name, BotType.HAUSHALT);
    }
}
