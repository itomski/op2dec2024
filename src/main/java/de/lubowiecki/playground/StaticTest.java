package de.lubowiecki.playground;

import java.time.LocalDate;

public class StaticTest {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker", LocalDate.of(1997, 10, 5));
        System.out.println(p1);

        Person p2 = new Person("Bruce", "Banner", LocalDate.of(1982, 1, 15));
        System.out.println(p2);

        {
            Person p3 = new Person();
        }
        Person p3 = new Person();
    }
}
