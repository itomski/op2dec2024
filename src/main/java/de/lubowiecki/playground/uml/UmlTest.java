package de.lubowiecki.playground.uml;

import java.io.Serializable;

public class UmlTest {

    public static void main(String[] args) {

        Kunde k1 = new Kunde("Peter", "Parker");
        Fahrzeug f1 = new Fahrzeug("HH:AB123");

        //k1.setFahrzeug(f1);
        f1.setKunde(k1); // Tun das gleiche

        System.out.println(k1);
        System.out.println(f1);

        // IS-A: Wird durch Vererbung realisiert
        Kunde k = new PermiumKunde();
        
        // HAS-A: Wird durch Attribute realisiert

    }
}

class Kunde implements Serializable {

    // JavaBeans
    // Alle Eigenschaften sind privat
    // Es gibt public Getter und Setter
    // Einen paramterlosen Konstruktor und ggfl. noch weitere Konstruktoren
    // Sind Serializable

    private String vorname;

    private String nachname;

    private Fahrzeug fahrzeug;

    public Kunde() {
    }

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
        if(fahrzeug.getKunde() != this)
            fahrzeug.setKunde(this);
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", fahrzeug=").append(fahrzeug.getKennzeichen());
        sb.append('}');
        return sb.toString();
    }
}

class PermiumKunde extends Kunde {
}

class Fahrzeug implements Serializable {

    private String kennzeichen;

    private Kunde kunde;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
        if(kunde.getFahrzeug() != this)
            kunde.setFahrzeug(this);
    }

    public Kunde getKunde() {
        return kunde;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", kunde=").append(kunde.getVorname()).append(" ").append(kunde.getNachname());
        sb.append('}');
        return sb.toString();
    }
}
