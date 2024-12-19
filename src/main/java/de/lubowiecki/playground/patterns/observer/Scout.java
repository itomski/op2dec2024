package de.lubowiecki.playground.patterns.observer;

public class Scout implements Observer {

    private int anzahl = 0;

    private String name;

    public Scout(String name) {
        this.name = name;
    }

    private void machtParty() {
        System.out.println(name + " macht eine Party...");
    }

    private void gehtSchlaffen() {
        System.out.println(name + " geht schlaffen...");
    }

    @Override
    public void update(Feuer feuer) {

        if(feuer.isAn()) {
            machtParty();
        }
        else {
            gehtSchlaffen();
            ++anzahl;
            if(anzahl >= 3) {
                feuer.removeObserver(this);
            }
        }
    }
}
