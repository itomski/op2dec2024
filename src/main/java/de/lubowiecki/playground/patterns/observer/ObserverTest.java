package de.lubowiecki.playground.patterns.observer;

public class ObserverTest {

    public static void main(String[] args) {

        Feuer feuer = new Feuer();
        System.out.println(feuer.isAn());

        Scout s1 = new Scout("Peter");
        Scout s2 = new Scout("Bruce");
        Scout s3 = new Scout("Carol");
        Scout s4 = new Scout("Tony");
        Wolf w1 = new Wolf();
        Wolf w2 = new Wolf();
        Wolf w3 = new Wolf();
        Wolf w4 = new Wolf();

        // Anmeldung der Beobachter
        feuer.addObserver(s1);
        feuer.addObserver(s2);
        feuer.addObserver(s3, s4, w1, w2, w3, w4);
        feuer.addObserver(s2);

        // feuer.setAn(false); // Zustand hat sich nicht geändert
        feuer.setAn(true);

        System.out.println();
        feuer.setAn(false);

        System.out.println();
        feuer.setAn(true);

        System.out.println();
        feuer.setAn(false);

        System.out.println();
        feuer.setAn(true);

        System.out.println();
        feuer.setAn(false);

        System.out.println();
        feuer.setAn(true);

    }
}
