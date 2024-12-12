package de.lubowiecki.playground.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        EMail eMail = new EMail("p.parker@shield.org", "b.banner@shield.org", "Iron-Man", "Was für ein Angeber...");
        //eMail.send();

        Sms sms = new Sms("0176234567", "017233445566", "Was für ein Angeber...");

        Server server = new Server();
        server.send(eMail);
        server.send(sms);

        ForumPost fp = new ForumPost("P.Parker", "Heros", "Iron-Man", "Was für ein Angeber...");
        fp.addTag("hero", "ironman", "gaga");

        //server.send(fp); // Error: ForumPost ist keine Message
        server.send(new ForumPostToMessageAdapter(fp)); // Error: ForumPost ist keine Message
    }
}
