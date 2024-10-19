package org.example.config;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
    // Carga las variables de entorno desde un archivo .env
    private static final Dotenv dotenv = Dotenv.configure().load();

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Establece la conexión a la base de datos utilizando las variables de entorno
            connection = DriverManager.getConnection(
                    dotenv.get("DB_URL"),      // URL de la base de datos
                    dotenv.get("DB_USER"),     // Usuario de la base de datos
                    dotenv.get("DB_PASSWORD")  // Contraseña de la base de datos
            );
            // Verifica si la conexión es válida
            if (connection != null && connection.isValid(2)) {
                System.out.println("Connection to Database established");
            } else {
                System.out.println("Failed to establish connection to Database");
            }
        } catch (SQLException e) {
            // Maneja errores específicos de conexión a la base de datos
            if (e.getSQLState().equals("08001")) {
                System.out.println("Database is not exist: " + dotenv.get("DB_URL"));
            } else {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return connection;
    }
}
