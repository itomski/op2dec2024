package de.lubowiecki.playground.patterns.adapter;

public class Sms implements Message {

        private final String fromNr;
        private final String toNr;
        private final String body;

        public final int MAX_LENGTH = 120;

        public Sms(String fromNr, String toNr, String body) {
            this.fromNr = fromNr;
            this.toNr = toNr;
            if(body.length() > MAX_LENGTH)
                this.body = body.substring(0, MAX_LENGTH);
            else
                this.body = body;
        }

        public void send() {
            System.out.println("----- SEND SMS -----");
            System.out.println("----- START");
            System.out.printf("----- FROM: \t%s \n", fromNr);
            System.out.printf("----- TO: \t\t%s \n", toNr);
            System.out.printf("----- BODY: \t%s \n", body);
            System.out.println("----- END");
        }
    }
