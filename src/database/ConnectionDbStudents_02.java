package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDbStudents_02 {

    static final String DB_URL = "jdbc:mysql://localhost/escola";
    static final String USER = "root";
    static final String PASS = "teste123";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        ) {
            System.out.println("Connected to Students database successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
