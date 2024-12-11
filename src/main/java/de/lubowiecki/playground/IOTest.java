package de.lubowiecki.playground;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOTest {

    public static void main(String[] args) {

        Path pfad = Paths.get("data.txt");
        try {
//            Writer out = Files.newBufferedWriter(pfad); // Verbindung öffnen
//            out.write("Das ist das Haus von Nikigraus!"); // Daten schreiben
//            out.close(); // Verbindung schließen

            BufferedReader in = Files.newBufferedReader(pfad);
            String line = null;
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

            // Liest den Inhalt der Datei Zeilenweise in eine Liste ein
            List<String> lines = Files.readAllLines(pfad);
            for(String l : lines) {
                System.out.println(l);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
