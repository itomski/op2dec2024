package de.lubowiecki.uebungen.u1;

public class Aufgabe {

//    Schreibe einen Server, der Nachrichten verschickt
//    Es sollen E-Mails, SMS und Video-Nachrichten verschicjt werden
//    Schreibe dazu eine Klasse Server, die eine Instanzmethode verschicken hat,
//    die Unterschiediliche Nachrichtentypen entgegennimmt
//    Verwende, wenn nötig Interfaces

    public static void main(String[] args) {

        Server server = new Server();
        server.send(new EMail("p.parker@shield.org", "b.banner@shield.org", "Moin Moin..."));
        server.send(new EMail("c.danvers@shield.org", "t.stark@shield.org", "Was gibt es zum Mittag?"));
        server.send(new Sms("017233445566", "017015161718", "Das ist das Haus von Nikigraus!"));


    }
}
