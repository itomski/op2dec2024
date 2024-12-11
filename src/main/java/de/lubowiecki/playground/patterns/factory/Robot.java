package de.lubowiecki.playground.patterns.factory;

public class Robot {

    private int xPos;

    private int yPos;

    private String name;

    public Robot() {
    }

    public Robot(int xPos, int yPos, String name) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.name = name;
    }

    public Robot(String name) {
        this.name = name;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpezialFunktion() {
        return "Keine";
    }
}
