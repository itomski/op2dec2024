package de.lubowiecki.playground.patterns.composite2;

public class DocTest {

    public static void main(String[] args) {

        PrintGroup group = new PrintGroup();
        group.addDoc(new ExcelDocument());
        group.addDoc(new WordDocument(), new TxtDocument(), new PowerpointDocument());
        group.addDoc(new ExcelDocument(), new PowerpointDocument());

        group.print();
    }
}
