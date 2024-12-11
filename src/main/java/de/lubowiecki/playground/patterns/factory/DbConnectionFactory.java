package de.lubowiecki.playground.patterns.factory;

/**
 * Fabrik für Datenbank-Verbindungs-URLs
 */
public class DbConnectionFactory {

    /**
     * Liefert einen passenden URL-String zurück
     * @param db Name des Datanbank-Typs (mysql, sqlite, h2)
     * @return
     */
    public String getConnectionUrl(String db) {
        return switch(db) {
            case "mysql" -> getMysqlConnectionUrl();
            case "sqlite" -> getSQLiteConnectionUrl();
            case "h2" -> getH2ConnectionUrl();
            default -> null; // ggfl eine Exception
        };
    }

    private String getMysqlConnectionUrl() {
        return "jdbc:mysql://localhost:3306/dbname";
    }

    private String getSQLiteConnectionUrl() {
        return "jdbc:sqlite:dbname";
    }

    private String getH2ConnectionUrl() {
        return "jdbc:h2:dbname";
    }
}
