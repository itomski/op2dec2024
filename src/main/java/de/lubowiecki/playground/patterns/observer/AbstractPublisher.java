package de.lubowiecki.playground.patterns.observer;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractPublisher {

    private List<Observer> observerList = new CopyOnWriteArrayList<>();

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
        Iterator<Observer> itr = observerList.iterator();
        while(itr.hasNext()) {
            itr.next().update(getState());
        }
        changed = false;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public abstract AbstractPublisher getState();
}
