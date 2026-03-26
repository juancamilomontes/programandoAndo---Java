import EjerciciosCiclosBucles.BuclesCiclos;
import EjerciciosCondicionales.EjerciciosCondicionales;
import databaseConexion.InicializarDb;
import CrudNotasBlock.MenuNotas;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        InicializarDb.crearTablas();

        String seleccion = JOptionPane.showInputDialog(
                "Bienvenido A Programando Ando\n" +
                "Aquí Aprenderemos a Programar Con Java\n\n" +
                "Lista De Ejercicios\n" +
                "1. Condicionales\n" +
                "2. Ciclos y Bucles\n" +
                "3. POO con Conexión a Base De Datos\n\n" +
                "Ingrese una opción:");

        try {
            int opcion = Integer.parseInt(seleccion);

            if (opcion == 1) {
                System.out.println("1. Ingresando a Ejercicios Con Condicionales");
                EjerciciosCondicionales ejerciciosCondicionales = new EjerciciosCondicionales();
            }
            else if (opcion == 2) {
                System.out.println("2. Ingresando a Ejercicios Con Ciclos y Bucles");
                BuclesCiclos Ciclos = new BuclesCiclos();
            }
            else if (opcion == 3) {
                System.out.println("3. Ingresando a Ejercicios Con POO con Conexion a Base De Datos");
                MenuNotas menuNotas = new MenuNotas();
                menuNotas.iniciar();
            }
            else {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
        }
    }
}