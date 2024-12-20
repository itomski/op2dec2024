package de.lubowiecki.playground.patterns.composite2;

public class ExcelDocument implements Printable {

    public void printExcel() {
        System.out.println("Excel-Daten werden gedruckt...");
    }


    @Override
    public void print() {
        printExcel();
    }
}
