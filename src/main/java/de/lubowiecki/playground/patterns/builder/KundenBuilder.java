package de.lubowiecki.playground.patterns.builder;

public class KundenBuilder {

    private String vorname = "Unbekannt";

    private String nachname = "Unbekannt";

    public KundenBuilder() {
    }

    public KundenBuilder setVorname(String vorname) {
        this.vorname = vorname; // Objektzustand ändern
        return this; // Aktuelles Objekt zurückgeben
    }

    public KundenBuilder setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public Kunde build() {
        return new Kunde(vorname, nachname);
    }
}
