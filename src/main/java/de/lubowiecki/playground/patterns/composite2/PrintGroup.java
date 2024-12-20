package de.lubowiecki.playground.patterns.composite2;

import java.util.ArrayList;
import java.util.List;

// Composite
public class PrintGroup implements Printable {

    private List<Printable> docs = new ArrayList<>();

    public void addDoc(Printable... docs) {
        this.docs.addAll(List.of(docs));
    }

    @Override
    public void print() {
        for(Printable p : docs) {
            p.print();
        }
    }
}
