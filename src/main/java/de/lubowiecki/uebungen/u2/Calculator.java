package de.lubowiecki.uebungen.u2;

public class Calculator {

    private static Calculator instance = new Calculator();
    private StringBuilder protokoll = new StringBuilder();

    private Calculator() {
    }

    public static Calculator getInstance() {
        return instance;
    }

    public double add(double a, double b) {
        double erg =  a + b;
        addToProtokoll(a, b, '+', erg);
        return erg;
    }

    public double sub(double a, double b) {
        double erg =  a - b;
        addToProtokoll(a, b, '-', erg);
        return erg;
    }

    public double multi(double a, double b) {
        double erg =  a * b;
        addToProtokoll(a, b, '*', erg);
        return erg;
    }

    public double div(double a, double b) {
        double erg =  a / b;
        addToProtokoll(a, b, '/', erg);
        return erg;
    }

    private void addToProtokoll(double a, double b, char operator, double erg) {
        protokoll.append(a).append(operator).append(b).append('=').append(erg).append("\n");
    }

    public String getProtokoll() {
        return protokoll.toString();
    }

    public void clear() {
        protokoll = new StringBuilder();
    }
}
