package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest1 {

    public static void main(String[] args) {


        try {
            // Erzeugung der Tabelle
            PersonCrud crud = new PersonCrud();

            // Insert
//            Person p = new Person("Peter", "Parker");
//            if(crud.save(p)) {
//                System.out.println("Gespeichert");
//            }

//            // Select
//            Person p = crud.find(1);
//            System.out.println(p);
//            if(p != null)
//                System.out.println(p.getVorname());

//            // FindAll
//            for(Person p : crud.findAll()) {
//                System.out.println(p);
//            }

//            // Delete By Person
//            {
//                Person p = crud.find(1);
//                if(crud.delete(p)) {
//                    System.out.println("Gelöscht!");
//                }
//            }

//            // Delete By ID
//            if(crud.deleteById(3)) {
//                System.out.println("Gelöscht!");
//            }
//
//            for(Person p : crud.findAll()) {
//                System.out.println(p);
//            }

            // Update
            Person p = new Person("Scott", "Lang");
            if(crud.save(p)) {
                System.out.println("Gespeichert");
            }

            System.out.println(p);

            p.setVorname("Tony");
            if(crud.save(p)) {
                System.out.println("Gespeichert");
            }
        }
        catch (SQLException e) {
            System.out.println("Probleme bei der Arbeit mit der Datenbank");
            e.printStackTrace();
        }
    }

    /*
    public static void main(String[] args) {

        try(Connection dbh = DriverManager.getConnection("jdbc:sqlite:data.db");
                Statement stmt = dbh.createStatement()) {

            System.out.println("Verbindung wurde aufgebaut");

//            createTable(stmt);
//            System.out.println("Tabelle wurde erzeugt");

            insert(stmt);
            System.out.println("Datensatz wurde erzeugt");


        }
        catch (SQLException e) {
            System.out.println("Verbindung zur Datenbank nicht möglich.");
        }

    }

    private static void createTable(Statement stmt) throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS personen (" +
                "id INTEGER," +
                "vorname TEXT NOT NULL," +
                "nachname TEXT NOT NULL," +
                "PRIMARY KEY (id AUTOINCREMENT)" +
                ")";

        stmt.execute(SQL);
    }

    private static void insert(Statement stmt) throws SQLException {

        final String SQL = "INSERT INTO personen (id, vorname, nachname) " +
                            "VALUES(null, 'Peter', 'Parker')";

        stmt.execute(SQL);
    }
    */
}
