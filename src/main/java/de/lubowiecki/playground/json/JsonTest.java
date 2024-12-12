package de.lubowiecki.playground.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    private static final String FILE = "data.json";
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

//        // HashCode und Equals
//        Fahrzeug f1 = new Fahrzeug("HH:AB123", "Ford", "Mustang", 1972);
//        Fahrzeug f2 = new Fahrzeug("HH:AB123", "Ford", "Mustang", 1972);
//        System.out.println(f1.equals(f2));
//        System.out.println(f1 == f2);
//        // Wenn zwei Objekt gem. equals gleich sind, müssen sie den gleiche HashCode haben
//        System.out.println(f1.hashCode());
//        System.out.println(f2.hashCode());
//        System.out.println();

//        List<Fahrzeug> fahrzeuge = new ArrayList<>();
//        fahrzeuge.add(new Fahrzeug("HH:AB123", "Ford", "Mustang", 1972));
//        fahrzeuge.add(new Fahrzeug("HH:XY227", "Mercedes", "A-Klasse", 2000));
//        fahrzeuge.add(new Fahrzeug("HH:CI1922", "VW", "Golf", 2010));
//        fahrzeuge.add(new Fahrzeug("HB:LK2218", "Renault", "Zoe", 2021));

        try {
            //saveToJson(fahrzeuge);

            List<Fahrzeug> fahrzeugList = loadFromJson();
            for(Fahrzeug f : fahrzeugList) {
                System.out.println(f.getKennzeichen());
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void saveToJson(List<Fahrzeug> fahrzeuge) throws IOException {
        mapper.writeValue(new FileWriter(FILE), fahrzeuge);
    }

    private static List<Fahrzeug> loadFromJson() throws IOException {
        // Ein Objekt einlesen
        // Fahrzeug f = mapper.readValue(new FileReader(FILE), Fahrzeug.class);

        // Eine Liste von Objekten einlesen
        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Fahrzeug.class);
        // Json wird zu einer Liste von Fahrzeugen geparst
        List<Fahrzeug> fahrzeuge = mapper.readValue(new FileReader(FILE), type);
        return fahrzeuge;
    }
}
