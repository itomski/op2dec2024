package de.lubowiecki.uebungen.u1;

public class Sms implements Message {

    // Instanzvariablen
    private String from;
    private String to;
    private String content;

    public Sms(String from, String to, String content) {
        // this.from = Instanzvariable
        // from = lokale Variable / Parameter
        this.from = from;
        this.to = to;
        //this.content = content;
        setContent(content);
    }

    public void setFrom(String from) {
        // Inhalt prüfen
        this.from = from;
    }

    public void setTo(String to) {
        // Inhalt prüfen
        this.to = to;
    }

    public void setContent(String content) {
        if(content.length() <= 140) {
            this.content = content;
            return;
        }
        throw new RuntimeException("Content ist zu lang...");
    }

    @Override
    public void submit() {
        System.out.printf("SMS von: %s an %s, Nachrichttext: %s \n", from, to, content);
    }
}
