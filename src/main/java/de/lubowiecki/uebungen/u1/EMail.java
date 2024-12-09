package de.lubowiecki.uebungen.u1;

public class EMail implements Message {

    private String from;
    private String to;
    private String content;

    public EMail() {
    }

    public EMail(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    // in Klassen ist default package-private
    public void submit() {
        System.out.println("Von: " + this.from);
        System.out.println("An: " + this.to);
        System.out.println("Inhalt: " + this.content);
    }
}
