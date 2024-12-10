package de.lubowiecki.playground.library;

public class Buch implements Medium {

    private String titel;
    private String autor;
    private int erscheinungsJahr;
    private int anzahlSeiten;

    public Buch() {
    }

    public Buch(String titel, String autor, int erscheinungsJahr, int anzahlSeiten) {
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsJahr = erscheinungsJahr;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public void setAnzahlSeiten(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }

    @Override
    public String getInfoShort() {
        return String.format("Buch: %s von %s", titel, autor);
    }

    @Override
    public String getInfoFull() {
        return String.format("Buch: %s von %s. Seiten %d, Erscheinungsjahr %d", titel, autor, anzahlSeiten, erscheinungsJahr);
    }
}
