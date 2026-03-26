package CrudNotasBlock;

import javax.swing.JOptionPane;
import databaseConexion.ConexionDb;
import java.sql.*;

public class MenuNotas {

    // 1. CREATE - Agregar nota
    void agregar() {
        String titulo = JOptionPane.showInputDialog("Título de la nota:");
        String contenido = JOptionPane.showInputDialog("Contenido de la nota:");

        if (titulo == null || titulo.isBlank() || contenido == null || contenido.isBlank()) {
    JOptionPane.showMessageDialog(null, "El título y contenido no pueden estar vacíos.");
    return;
}

        String sql = "INSERT INTO notas (titulo, contenido) VALUES (?, ?)"; 
        
        try (Connection conn = ConexionDb.getConexion(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, titulo);
            ps.setString(2, contenido);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Nota guardada con éxito!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
        }
    }

    // 2. READ - Ver todas las notas
    void verTodos() {
        String sql = "SELECT * FROM notas";
        StringBuilder resultado = new StringBuilder("MIS NOTAS:\n\n");
        
        try (Connection conn = ConexionDb.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
             
            while (rs.next()) {
                resultado.append("ID: ").append(rs.getInt("id"))
                         .append(" | Título: ").append(rs.getString("titulo"))
                         .append("\nContenido: ").append(rs.getString("contenido"))
                         .append("\n------------------\n");
            }
            JOptionPane.showMessageDialog(null, resultado.toString());
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ver notas: " + e.getMessage());
        }
    }

    // 3. UPDATE - Actualizar nota
    void actualizar() {
        String id = JOptionPane.showInputDialog("ID de la nota a editar:");
        String nuevoTitulo = JOptionPane.showInputDialog("Nuevo título:");
        String nuevoContenido = JOptionPane.showInputDialog("Nuevo contenido:");

        if (id == null || nuevoTitulo == null || nuevoContenido == null) {
    JOptionPane.showMessageDialog(null, "Operación cancelada.");
    return;
}

        String sql = "UPDATE notas SET titulo=?, contenido=? WHERE id=?";
        
        try (Connection conn = ConexionDb.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, nuevoTitulo);
            ps.setString(2, nuevoContenido);
            ps.setInt(3, Integer.parseInt(id));
            
            int filas = ps.executeUpdate();
            if (filas > 0) JOptionPane.showMessageDialog(null, "Nota actualizada!");
            else JOptionPane.showMessageDialog(null, "No se encontró esa nota.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // 4. DELETE - Eliminar nota
    void eliminar() {
        String id = JOptionPane.showInputDialog("ID de la nota a borrar:");
        if (id == null || id.isBlank()) {
    JOptionPane.showMessageDialog(null, "Operación cancelada.");
    return;
}
        String sql = "DELETE FROM notas WHERE id=?";
        
        try (Connection conn = ConexionDb.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, Integer.parseInt(id));
            int filas = ps.executeUpdate();
            
            if (filas > 0) JOptionPane.showMessageDialog(null, "Nota eliminada.");
            else JOptionPane.showMessageDialog(null, "ID no encontrado.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // MENU PRINCIPAL
    public void iniciar() { 
        String opcion = "";

        while (opcion != null && !opcion.equals("5")) {
            opcion = JOptionPane.showInputDialog(
                    "--- BLOG DE NOTAS ---\n\n" +
                    "1. Agregar nota\n" +
                    "2. Ver notas\n" +
                    "3. Actualizar nota\n" +
                    "4. Eliminar nota\n" +
                    "5. Salir\n\n" +
                    "Seleccione:");

            if (opcion == null || opcion.equals("5")) break;

            if (opcion.equals("1")) agregar();
            if (opcion.equals("2")) verTodos();
            if (opcion.equals("3")) actualizar();
            if (opcion.equals("4")) eliminar();
        }
    }
}