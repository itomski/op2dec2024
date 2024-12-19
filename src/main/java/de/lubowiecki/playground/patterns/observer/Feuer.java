package de.lubowiecki.playground.patterns.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Feuer {

    private boolean an;

    private List<Observer> observerList = new CopyOnWriteArrayList<>();
    //private Set<Observer> observerSet = new HashSet<>(); // Set erlaubt keine Duplikate

    private boolean changed = false;

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void addObserver(Observer... observer) {
        observerList.addAll(List.of(observer));
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
//        for(Observer o : observerSet) { // ConcurrentModificationException wenn gleichzeitig durchlaufen und bearbeitet wird
//            o.update(this);
//        }

        Iterator<Observer> itr = observerList.iterator();
        while(itr.hasNext()) {
            itr.next().update(this);
        }
        changed = false;
    }

    public boolean isAn() {
        return an;
    }

    public void setAn(boolean an) {
        if(this.an != an) {
            this.an = an;
            changed = true;
        }

        if(changed)
            notifyObservers();
    }
}
