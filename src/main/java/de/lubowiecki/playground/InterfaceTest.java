package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {

        AutoReinigung obj1 = new AutoReinigung();
        // obj1 = new HandyReparatur(); // HandyReparatur IS-NOT-A AutoReinigung

        Job j1 = new AutoReinigung();
        j1.doTheJob();
        j1 = new HandyReparatur();
        j1.doTheJob();
        j1 = () -> System.out.println("Mach irgendwas..."); // Lambda
        j1.doTheJob();

        System.out.println();

        List<Job> jobs = new ArrayList<>();
        // jobs = new LinkedList<>();
        jobs.add(new AutoReinigung());
        jobs.add(new AutoReinigung());
        jobs.add(new HandyReparatur());
        jobs.add(() -> System.out.println("Mach irgendwas..."));
        jobs.add(() -> System.out.println("Mach irgendwas anderes..."));
        jobs.add(new HandyReparatur());

        for(Job j : jobs) {
            j.doTheJob();
        }
    }
}

interface Job {
    void doTheJob(); // Alle Methoden im Interface sind public
}

class AutoReinigung implements Job {

    @Override
    public void doTheJob() {
        System.out.println("Das Auto wird gewaschen...");
    }
}

class HandyReparatur implements Job {

    @Override
    public void doTheJob() {
        System.out.println("Das Handy wird repariert...");
    }
}