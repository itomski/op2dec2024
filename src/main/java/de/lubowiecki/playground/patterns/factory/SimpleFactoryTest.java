package de.lubowiecki.playground.patterns.factory;

import java.time.LocalDate;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        DbConnectionFactory factory = new DbConnectionFactory();

        String url = factory.getConnectionUrl("mysql");
        // url = factory.getMysqlConnectionUrl(); // Error: ist privat
        System.out.println(url);

        url = factory.getConnectionUrl("sqlite");
        System.out.println(url);

        System.out.println();

        LocalDate heute = LocalDate.now(); // now() ist eine Factory für LocalDate-Objekte
    }
}
