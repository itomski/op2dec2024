package de.lubowiecki.playground.patterns.observer;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

// Publisher / Subject
// Der Publisher benachrichtigt die Subscriber über die eigenen Zustands-Änderung
public class Feuer extends AbstractPublisher {

    private boolean an;

    public boolean isAn() {
        return an;
    }

    public void setAn(boolean an) {
        if(this.an != an) {
            this.an = an;
            setChanged(true);
        }

        if(isChanged())
            notifyObservers();
    }


    @Override
    public AbstractPublisher getState() {
        return this;
    }
}
