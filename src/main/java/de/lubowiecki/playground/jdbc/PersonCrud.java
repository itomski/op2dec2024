package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// ORM - Objekt Relationales Mapping
public class PersonCrud {

    private final String TABLE = "personen";


    public PersonCrud() throws SQLException {
        createTable();
    }

    // Read
    public Person find(int id) throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection dbh = DbConnectionFactory.get();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
            ResultSet result = stmt.getResultSet();
            if(result.next()) {
                return populate(result);
            }
            // TODO: null durch ein Optional ersetzen
            return null;
        }
    }

    public List<Person> findAll() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection dbh = DbConnectionFactory.get();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
            ResultSet result = stmt.getResultSet();

            List<Person> liste = new ArrayList<>();

            while(result.next()) {
                liste.add(populate(result));
            }
            return liste;
        }
    }

    // Create
    public boolean insert(Person person) throws SQLException {

        // TODO: SQLInjection ist möglich
        String sql = "INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(null, '%s', '%s')";
        sql = String.format(sql, person.getVorname(), person.getNachname());

        try(Connection dbh = DbConnectionFactory.get();
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
    public boolean delete(Person person) throws SQLException {
        return deleteById(person.getId());
    }

    public boolean deleteById(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection dbh = DbConnectionFactory.get();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
            return stmt.getUpdateCount() > 0;
        }
    }

    private void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER," +
                "vorname TEXT NOT NULL," +
                "nachname TEXT NOT NULL," +
                "PRIMARY KEY (id AUTOINCREMENT))";

        try(Connection dbh = DbConnectionFactory.get();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(SQL);
        }
    }

    private Person populate(ResultSet result) throws SQLException {
        Person p = new Person();
        p.setId(result.getInt("id"));
        p.setVorname(result.getString("vorname"));
        p.setNachname(result.getString("nachname"));
        return p;
    }
}
