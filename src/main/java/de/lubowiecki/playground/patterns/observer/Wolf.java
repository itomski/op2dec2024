package de.lubowiecki.playground.patterns.observer;

// Subscriber
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
    public void update(AbstractPublisher obj) {

        Feuer feuer = (Feuer) obj;

        if(feuer.isAn()) {
            verstecktSich();
        }
        else {
            gehtAufDieJagd();
        }

    }
}
