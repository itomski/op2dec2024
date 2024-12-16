package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// ORM - Objekt Relationales Mapping
public class PersonCrud {

    // ORM-Pattern
    // DataMapper: Datenklasse (Person) + Mapper-Klasse (PersonCrud)
    // ActiveRecord: Datenklasse enthält die Persistenzlogik (Person)

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

    public boolean save(Person person) throws SQLException {
        if(person.getId() > 0) {
            return update(person);
        }
        else {
            return insert(person);
        }
    }

    // Create
    private boolean insert(Person person) throws SQLException {

        // mit PreparedStatements ist eine SQLInjection nicht mehr möglich
        final String SQL = "INSERT INTO " + TABLE + " (id, vorname, nachname) VALUES(null, ?, ?)";

        try(Connection dbh = DbConnectionFactory.get();
            PreparedStatement stmt = dbh.prepareStatement(SQL)) {
            stmt.setString(1, person.getVorname());
            stmt.setString(2, person.getNachname());
            stmt.execute();

            // Den vergebenen PrimatyKey abfragen und in Person ablegen
            ResultSet keys = stmt.getGeneratedKeys();
            if(keys.next()) {
                person.setId(keys.getInt(1));
                return true;
            }
            return false;
        }
    }

    // Update
    private boolean update(Person person) throws SQLException {

        String sql = "UPDATE " + TABLE + " SET vorname = '%s', nachname = '%s' WHERE id = %d";
        sql = String.format(sql, person.getVorname(), person.getNachname(), person.getId());

        try(Connection dbh = DbConnectionFactory.get();
            Statement stmt = dbh.createStatement()) {
            stmt.execute(sql);
            return stmt.getUpdateCount() > 0;
        }
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
