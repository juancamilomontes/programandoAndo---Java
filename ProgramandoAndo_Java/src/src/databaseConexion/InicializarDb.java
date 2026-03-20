package databaseConexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InicializarDb {
   
   public static void crearTablas() {
        String sql = "CREATE TABLE IF NOT EXISTS notas (" +
             "id INTEGER PRIMARY KEY AUTOINCREMENT," +
             "titulo TEXT NOT NULL," +
             "contenido TEXT NOT NULL)";

        try (Connection conn = ConexionDb.getConexion();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'notas' creada o ya existente.");
        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
        }
    }

}
