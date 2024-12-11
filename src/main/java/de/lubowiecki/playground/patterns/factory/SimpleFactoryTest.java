package de.lubowiecki.playground.patterns.factory;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

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

        System.out.println();

        // FunctionalInterface
        // T get();
        Supplier<Integer> W6 = () -> (int)(Math.random() * 6) + 1;
        System.out.println(W6.get());

        Stream.generate(W6)
                .limit(100)
                .forEach(w -> System.out.println(w));
    }
}


// in JavaScript möglich
//var xyz = function(a, b) {
//    return a + b;
//}
//xyz(10, 15)