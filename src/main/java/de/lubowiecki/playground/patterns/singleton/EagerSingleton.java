package de.lubowiecki.playground.patterns.singleton;

public class EagerSingleton {

    private int zahl;

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getZahl() {
        LoggerSingleton.getInstance().log("Ich bin in der getZahl");
        return zahl;
    }

    public void up() {
        zahl++;
    }
}
