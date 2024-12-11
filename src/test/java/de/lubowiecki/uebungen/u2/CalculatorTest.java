package de.lubowiecki.uebungen.u2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = Calculator.getInstance();
        double erg = calc.add(10.5, 15.5);
        assertTrue(erg == 26);
        String protokoll = calc.getProtokoll();
        assertTrue(protokoll.contains("10.5+15.5=26.0"));
    }

    @Test
    public void multi() {
        Calculator calc = Calculator.getInstance();
        double erg = calc.multi(10, 15);
        assertTrue(erg == 150);
        String protokoll = calc.getProtokoll();
        assertTrue(protokoll.contains("10.0*15.0=150.0"));
    }

    @Test
    public void sub() {
        double erg = Calculator.getInstance().sub(100, 150);
        assertTrue(erg == -50.0);
    }

    @Test
    public void div() {
        double erg = Calculator.getInstance().div(100, 5);
        assertTrue(erg == 20);
    }
}