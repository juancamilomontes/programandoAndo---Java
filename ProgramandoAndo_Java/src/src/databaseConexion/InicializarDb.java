package databaseConexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InicializarDb {
   
   public static void crearTablas() {
        String sql = """
                CREATE TABLE IF NOT EXISTS productos (
                    id      INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre  TEXT    NOT NULL,
                    precio  REAL    NOT NULL,
                    cantidad INTEGER NOT NULL
                );
                """;

        try (Connection conn = ConexionDb.getConexion();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'productos' creada o ya existente.");
        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
        }
    }

}
