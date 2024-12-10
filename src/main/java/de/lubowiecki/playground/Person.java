package de.lubowiecki.playground;

import java.time.LocalDate;

public class Person {

    // Klassenvariable: Alle Objekte teilen siche eine gemeinsam
    private static int count;

    // Instanzvariablen: Werden mit Standardwerten initialisiert
    // Jedes Objekt hat seine eigenen
    private int id;

    private String vorname;

    private String nachname;

    private LocalDate geburtsDatum;

    public Person() {
        id = ++count;
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append('}');
        return sb.toString();
    }
}
