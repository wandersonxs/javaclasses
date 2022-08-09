package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb {

    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "teste123";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
//            String sql = "CREATE DATABASE STUDENTS";

            String sql = "CREATE TABLE  escola.estudante2 (\n" +
                    "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "    nome VARCHAR(255) NOT NULL,\n" +
                    "    data_nascimento DATE\n" +
                    ")  ENGINE=INNODB;";

            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
