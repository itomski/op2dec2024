package de.lubowiecki.playground.patterns.composite;

public class Rechteck extends AbstractGeoForm {

    private final int laenge;
    private final int breite;

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(int x, int y, int laenge, int breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rechteck{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(laenge);
        sb.append(", breite=").append(breite);
        sb.append('}');
        return sb.toString();
    }
}
