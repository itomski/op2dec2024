package de.lubowiecki.playground.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gruppe implements Movable {

    private List<Movable> elemente = new ArrayList<>();

    public Gruppe(Movable... sammlung) {
        add(sammlung);
    }

    @Override
    public void move(int x, int y) {
        for(Movable m : elemente)
            m.move(x, y);
    }

    public void add(Movable element) {
        elemente.add(element);
    }

    public void add(Movable... sammlung) {
        elemente.addAll(Arrays.asList(sammlung));
    }
}
