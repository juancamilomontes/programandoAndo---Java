package CrudRestaurante;

import javax.swing.JOptionPane;
import java.sql.*;

public class MenuRestaurante {

    static String URL = "jdbc:sqlite:mibasededatos.db";

    // CONEXION
    static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    // CREAR TABLA
    static void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS productos (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nombre TEXT NOT NULL,"                 +
                     "precio REAL NOT NULL,"                 +
                     "cantidad INTEGER NOT NULL)";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // CREATE - Agregar producto
    static void agregar() {
        String nombre   = JOptionPane.showInputDialog("Nombre del producto:");
        String precio   = JOptionPane.showInputDialog("Precio:");
        String cantidad = JOptionPane.showInputDialog("Cantidad:");

        String sql = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";
        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setDouble(2, Double.parseDouble(precio));
            ps.setInt(3, Integer.parseInt(cantidad));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto agregado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // READ - Ver todos los productos
    static void verTodos() {
        String sql = "SELECT * FROM productos";
        String resultado = "PRODUCTOS REGISTRADOS:\n\n";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                resultado += "ID: "       + rs.getInt("id")
                           + " | "        + rs.getString("nombre")
                           + " | $"       + rs.getDouble("precio")
                           + " | Stock: " + rs.getInt("cantidad") + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // UPDATE - Actualizar producto por ID
    static void actualizar() {
        String id       = JOptionPane.showInputDialog("ID del producto a actualizar:");
        String nombre   = JOptionPane.showInputDialog("Nuevo nombre:");
        String precio   = JOptionPane.showInputDialog("Nuevo precio:");
        String cantidad = JOptionPane.showInputDialog("Nueva cantidad:");

        String sql = "UPDATE productos SET nombre=?, precio=?, cantidad=? WHERE id=?";
        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setDouble(2, Double.parseDouble(precio));
            ps.setInt(3, Integer.parseInt(cantidad));
            ps.setInt(4, Integer.parseInt(id));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto actualizado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // DELETE - Eliminar producto por ID
    static void eliminar() {
        String id  = JOptionPane.showInputDialog("ID del producto a eliminar:");
        String sql = "DELETE FROM productos WHERE id=?";
        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // MENU PRINCIPAL
    public void iniciar() {
        crearTabla();
        String opcion = "";

        while (!opcion.equals("5")) {
            opcion = JOptionPane.showInputDialog(
                    "RESTAURANTE - Gestion de Productos\n\n" +
                    "1. Agregar producto\n"    +
                    "2. Ver productos\n"       +
                    "3. Actualizar producto\n" +
                    "4. Eliminar producto\n"   +
                    "5. Salir\n\n"             +
                    "Seleccione una opcion:");

            if (opcion == null) break;

            if (opcion.equals("1")) agregar();
            if (opcion.equals("2")) verTodos();
            if (opcion.equals("3")) actualizar();
            if (opcion.equals("4")) eliminar();
            if (opcion.equals("5")) JOptionPane.showMessageDialog(null, "Hasta luego!");
        }
    }
}