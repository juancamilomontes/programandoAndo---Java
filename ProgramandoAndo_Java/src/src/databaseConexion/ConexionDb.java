package databaseConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {
    private static final String URL = "jdbc:sqlite:database.db";

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("org.sqlite.JDBC"); 
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa a SQLite.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver no encontrado. Agrega el JAR.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}