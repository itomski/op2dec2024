package de.lubowiecki.playground.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Kreis k = new Kreis(100);
        System.out.println(k);
        //k.setX(10);
        //k.setY(20);
        k.move(10, 20);
        System.out.println(k);

        Rechteck r1 = new Rechteck(100, 200);
        System.out.println(r1);
        r1.move(22, 17);
        System.out.println(r1);

        Rechteck r2 = new Rechteck(27, 18, 120, 75);
        System.out.println(r2);

        System.out.println();

        Gruppe gr1 = new Gruppe(r1, r2);
        gr1.add(k);
        //gr1.add(r1, r2);
        gr1.move(50, 77);

        System.out.println(k);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println();

        Gruppe gr2 = new Gruppe();
        gr2.add(new Kreis(-20, -100, 100));
        gr2.add(new Kreis(-10, -20, 110));
        gr2.add(new Kreis(10, 10, 120));
        gr2.add(new Kreis(130));
        gr2.add(gr1);

        gr2.move(200, 200);
        System.out.println(k);
        System.out.println(r1);
        System.out.println(r2);
    }
}
