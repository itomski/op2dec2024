package de.lubowiecki.playground;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        Person p = new Person("Peter", "Parker", LocalDate.of(2000, 10, 15));
        personen.add(p);
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1982, 1, 10)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1995, 7, 20)));

        // Schreiben (Überschreiben)
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personen.ser"))) {
//            out.writeObject(personen);
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }

        System.out.println();

        // Lesen
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("personen.ser"))) {
            List<Person> ausDerDatei = (List<Person>) in.readObject();
            for (Person v : ausDerDatei) {
                System.out.println(v.getVorname());
            }
        }
        catch(IOException | ClassNotFoundException e) { // Multicatch
            e.printStackTrace();
        }
    }

}
