package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

// ORM - Objekt Relationales Mapping
public class PersonCrud {

    public PersonCrud() throws SQLException {
        createTable();
    }

    // Read
    public Person find(int id) {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }

    public List<Person> findAll() {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }

    // Create
    public boolean insert(Person person) throws SQLException {

        // TODO: SQLInjection ist möglich
        String sql = "INSERT INTO personen (id, vorname, nachname) VALUES(null, '%s', '%s')";
        sql = String.format(sql, person.getVorname(), person.getNachname());

        try(Connection dbh = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = dbh.createStatement()) {
            stmt.execute(sql);
            return stmt.getUpdateCount() > 0;
        }
    }

    // Update
    public boolean update(Person person) {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }

    // Delete
    public boolean delete(Person person) {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }

    private void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS personen (" +
                "id INTEGER," +
                "vorname TEXT NOT NULL," +
                "nachname TEXT NOT NULL," +
                "PRIMARY KEY (id AUTOINCREMENT)" +
                ")";

        try(Connection dbh = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
