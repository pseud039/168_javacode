package main.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/librarydb",
                    "postgres",
                    "0309"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
