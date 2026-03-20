package EjerciciosCondicionales;
/*
========================================
EJERCICIO 1 - Número positivo, negativo o cero
========================================
Pida un número entero al usuario e imprima:

- "Positivo" si el número es mayor que 0
- "Negativo" si el número es menor que 0
- "Cero" si el número es igual a 0

Use if - else if - else.
*/

/*
========================================
EJERCICIO 2 - Número par o impar
========================================
Solicite un número entero al usuario y determine si es:

- Par
- Impar

Use el operador módulo (%) para resolverlo.
*/

/*
========================================
EJERCICIO 3 - Mayor de edad
========================================
Pida la edad del usuario.

- Si es mayor o igual a 18 → mostrar "Puede ingresar"
- Si es menor → mostrar "Acceso denegado"
- Si la edad es negativa → mostrar "Edad inválida"

Use estructuras condicionales.
*/

/*
========================================
EJERCICIO 4 - Calculadora básica
========================================
Solicite:

- Dos números
- Un operador (+, -, *, /)

Según el operador, realice la operación correspondiente.

Use switch.

Valide que no se pueda dividir entre cero.
*/

/*
========================================
EJERCICIO 5 - Año bisiesto
========================================
Pida un año y determine si es bisiesto.

Reglas:
- Es divisible entre 4
- No es divisible entre 100
- Excepto si es divisible entre 400

Imprima si el año es o no es bisiesto.
*/
/*
========================================
EJERCICIO 6 - Clasificación de nota
========================================
Pida una nota entre 0 y 100 y clasifíquela así:

90 – 100 → Excelente
80 – 89  → Bueno
70 – 79  → Aceptable
60 – 69  → Insuficiente
Menor a 60 → Reprobado

Valide que la nota esté en el rango correcto.
*/

/*
========================================
EJERCICIO 7 - Número mayor entre tres
========================================
Solicite tres números al usuario e imprima cuál es el mayor.

Extra:
- Si hay empate, indíquelo.
*/

/*
========================================
EJERCICIO 8 - Descuento en tienda
========================================
Solicite el valor de una compra.

Aplique los siguientes descuentos:

Mayor a 100000 → 10%
Mayor a 200000 → 15%
Mayor a 500000 → 20%

Imprima:
- Valor original
- Porcentaje de descuento aplicado
- Valor final a pagar
*/

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
========================================
EJERCICIO 9 - Sistema de login
========================================
Simule un sistema de login donde:

Usuario correcto: "admin"
Contraseña correcta: "1234"

Si ambos coinciden → mostrar "Bienvenido"
Si no → mostrar "Credenciales incorrectas"

Use el método equals() para comparar Strings.
*/
/*
========================================
EJERCICIO 10 - Cálculo de IMC
========================================
Solicite:

- Peso en kilogramos
- Altura en metros

Calcule el IMC con la fórmula:

IMC = peso / (altura * altura)

Clasifique el resultado:

Menor a 18.5 → Bajo peso
18.5 – 24.9 → Normal
25 – 29.9 → Sobrepeso
30 o más → Obesidad
*/
public class EjerciciosCondicionales {

    public EjerciciosCondicionales() {

        String Selecion = JOptionPane.showInputDialog(
                "EJERCICIO 1 - Número positivo, negativo o cero\n" +
                        "EJERCICIO 2 - Número par o impar\n" +
                        "EJERCICIO 3 - Mayor de edad\n" +
                        "EJERCICIO 4 - Calculadora básica\n" +
                        "EJERCICIO 5 - Año bisiesto\n" +
                        "EJERCICIO 6 - Clasificación de nota\n" +
                        "EJERCICIO 7 - Número mayor entre tres\n" +
                        "EJERCICIO 8 - Descuento en tienda\n" +
                        "EJERCICIO 9 - Sistema de login\n" +
                        "EJERCICIO 10 - Cálculo de IMC\n\n" +
                        "Ingrese un ejercicio:");

        int Ejercicios = Integer.parseInt(Selecion);

        if (Ejercicios == 1) {
            System.out.println("EJERCICIO 1 - Número positivo, negativo o cero");
            System.out.println("Ingrese un numero Para determinar si es Negativo o Positivo");
            int numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un numero Para determinar si es Negativo o Positivo"));

            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "Numero es positivo " + numero);

            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Numero es Negativo " + numero);

            } else {

                JOptionPane.showMessageDialog(null, "Numero Ingresado es Cero " + numero);

            }
        }
        if (Ejercicios == 2) {
            // Inicio Desarrollo Ejercicio 2

        }

        if (Ejercicios == 3) {
            // Inicio Desarrollo Ejercicio 3
        }
        if (Ejercicios == 4) {
            // Inicio Desarrollo Ejercicio 4
        }
        if (Ejercicios == 5) {
            // Inicio Desarrollo Ejercicio 5
        }
        if (Ejercicios == 6) {
            // Inicio Desarrollo Ejercicio 6
        }
        if (Ejercicios == 7) {
            // Inicio Desarrollo Ejercicio 7
        }
        if (Ejercicios == 8) {
            // Inicio Desarrollo Ejercicio 8
        }

        if (Ejercicios == 10) {
            // Inicio Desarrollo Ejercicio 10
        }

        if (Ejercicios > 10 || Ejercicios <= 0) {
            System.out.println("Ingreso un valor invalido");

        }
    }
}
