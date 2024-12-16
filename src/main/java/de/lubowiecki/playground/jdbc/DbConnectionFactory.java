package de.lubowiecki.playground.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionFactory {

    private static final String URL = "jdbc:sqlite:data.db";

    private DbConnectionFactory() {
    }

    public static Connection get() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
