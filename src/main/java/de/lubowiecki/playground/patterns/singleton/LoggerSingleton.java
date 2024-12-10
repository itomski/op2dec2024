package de.lubowiecki.playground.patterns.singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LoggerSingleton {

    private List<String> logs = new ArrayList<>();

    private static LoggerSingleton instance = new LoggerSingleton();

    // Objekterzeugung mit dem Konstruktor ist nicht möglich
    private LoggerSingleton() {
    }

    // Beim Bedarf wird getInstance verwendet und diese liefert IMMER das gleiche Objekt aus
    public static LoggerSingleton getInstance() {
        return instance;
    }

    public void log(String msg) {
        logs.add(LocalDateTime.now() + ": " + msg);
    }

    public void print() {
        for(String s : logs)
            System.out.println(s);
    }
}
