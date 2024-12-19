package de.lubowiecki.playground.patterns.observer;

public class Wolf implements Observer {

    private static int count;

    private int nr;

    public Wolf() {
        nr = ++count;
    }

    private void verstecktSich() {
        System.out.printf("Wolf Nr. %d versteckt sich. \n", nr);
    }

    private void gehtAufDieJagd() {
        System.out.printf("Wolf Nr. %d geht auf die Jagd. \n", nr);
    }

    @Override
    public void update(Feuer feuer) {

        if(feuer.isAn()) {
            verstecktSich();
        }
        else {
            gehtAufDieJagd();
        }

    }
}
