package de.lubowiecki.playground.patterns.factory;

public class HaushaltRobot extends Robot {

    private String spezialFunktion;

    public HaushaltRobot(String name, String spezialFunktion) {
        super(name);
        this.spezialFunktion = spezialFunktion;
    }

    public HaushaltRobot(int xPos, int yPos, String name, String spezialFunktion) {
        super(xPos, yPos, name);
        this.spezialFunktion = spezialFunktion;
    }

    @Override
    public String getSpezialFunktion() {
        return spezialFunktion;
    }
}
