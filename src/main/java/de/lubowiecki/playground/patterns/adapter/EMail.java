package de.lubowiecki.playground.patterns.adapter;

public class EMail implements Message {

    private final String from;
    private final String to;
    private final String subject;
    private final String body;

    public EMail(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public void send() {
        System.out.println("----- SEND E_MAIL -----");
        System.out.println("----- START");
        System.out.printf("----- FROM: \t%s \n", from);
        System.out.printf("----- TO: \t\t%s \n", to);
        System.out.printf("----- SUBJECT: \t%s \n", subject);
        System.out.printf("----- BODY: \t%s \n", body);
        System.out.println("----- END");
    }
}
