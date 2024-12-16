package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest1 {

    public static void main(String[] args) {


        try {
            PersonCrud crud = new PersonCrud();

            Person p = new Person("Bruce", "Banner");
            crud.insert(p);

        }
        catch (SQLException e) {
            System.out.println("Probleme bei der Arbeit mit der Datenbank");
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
