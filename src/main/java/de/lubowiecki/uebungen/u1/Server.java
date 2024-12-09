package de.lubowiecki.uebungen.u1;

public class Server {

    public Server() {
        System.out.println("Server wird gestartet...");
    }

    // Statt einer Klasse wird hier ein Interface benutzt
    public void send(Message msg) {
        System.out.println("Verbinden...");
        System.out.println("Nachricht verschicken");
        msg.submit();
        System.out.println("Trennen...");
    }
}
