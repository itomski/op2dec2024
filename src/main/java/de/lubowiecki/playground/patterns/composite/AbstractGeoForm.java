package de.lubowiecki.playground.patterns.composite;

// Abstrakte Klassen dürfen nicht instanziert werden
public abstract class AbstractGeoForm implements Movable {

    private int x;
    private int y;

    public AbstractGeoForm() {
    }

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
