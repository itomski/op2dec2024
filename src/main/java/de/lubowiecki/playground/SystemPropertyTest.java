package de.lubowiecki.playground;

import java.util.Properties;

public class SystemPropertyTest {

    public static void main(String[] args) {

        Properties props = System.getProperties();
        props.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(System.getProperty("user.home"));

    }
}
