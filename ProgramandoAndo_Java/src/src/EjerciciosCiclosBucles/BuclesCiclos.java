package EjerciciosCiclosBucles;

import java.util.Scanner;

// 1. Imprimir los números del 1 al 50 usando un ciclo for.
// 2. Mostrar los números del 50 al 1 usando un ciclo for.
// 3. Imprimir todos los números pares del 1 al 100 usando un ciclo for.
// 4. Imprimir todos los números impares del 1 al 100 usando un ciclo while.
// 5. Calcular la suma de los números del 1 al 100 usando un ciclo for.
// 6. Calcular la suma de los números impares del 1 al 50 usando un ciclo for.
// 7. Mostrar la tabla de multiplicar del número 7 usando un ciclo for.
// 8. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados.
// 9. Contar cuántos números del 1 al 200 son múltiplos de 10 usando un ciclo for.
// 10. Mostrar los números del 1 al 100 que sean divisibles entre 3 y 5 usando un ciclo for.
// 11. Calcular el factorial de un número almacenado en una variable usando un ciclo for.
// 12. Recorrer un arreglo de 10 números e imprimir cada elemento usando un ciclo for.
// 13. Calcular la suma de los elementos de un arreglo usando un ciclo for.
// 14. Encontrar el número mayor dentro de un arreglo usando un ciclo for.
// 15. Encontrar el número menor dentro de un arreglo usando un ciclo for.
// 16. Contar cuántas veces aparece un número específico en un arreglo usando un ciclo for.
// 18. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.
// 19. Mostrar los primeros 20 números y su cubo usando un ciclo for.
// 20. Recorrer una cadena de texto e imprimir cada carácter usando un ciclo for.
public class BuclesCiclos {
    public BuclesCiclos() {
        System.out.println("1. Imprimir los números del 1 al 50 usando un ciclo for.");
        System.out.println("2. Mostrar los números del 50 al 1 usando un ciclo for.");
        System.out.println("3. Imprimir todos los números pares del 1 al 100 usando un ciclo for.");
        System.out.println("4. Imprimir todos los números impares del 1 al 100 usando un ciclo while.");
        System.out.println("5. Calcular la suma de los números del 1 al 100 usando un ciclo for.");
        System.out.println("6. Calcular la suma de los números impares del 1 al 50 usando un ciclo for.");
        System.out.println("7. Mostrar la tabla de multiplicar del número 7 usando un ciclo for.");
        System.out.println("8. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados.");
        System.out.println("9. Contar cuántos números del 1 al 200 son múltiplos de 10 usando un ciclo for.");
        System.out.println("10. Mostrar los números del 1 al 100 que sean divisibles entre 3 y 5 usando un ciclo for.");
        System.out.println("11. Calcular el factorial de un número almacenado en una variable usando un ciclo for.");
        System.out.println("12. Recorrer un arreglo de 10 números e imprimir cada elemento usando un ciclo for.");
        System.out.println("13. Calcular la suma de los elementos de un arreglo usando un ciclo for.");
        System.out.println("14. Encontrar el número mayor dentro de un arreglo usando un ciclo for.");
        System.out.println("15. Encontrar el número menor dentro de un arreglo usando un ciclo for.");
        System.out.println("16. Contar cuántas veces aparece un número específico en un arreglo usando un ciclo for.");
        System.out.println("17. Imprimir un triángulo de asteriscos de altura 5 usando ciclos for anidados.");
        System.out.println("18. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.");
        System.out.println("19. Mostrar los primeros 20 números y su cubo usando un ciclo for.");
        System.out.println("20. Recorrer una cadena de texto e imprimir cada carácter usando un ciclo for.");

        System.out.println("Ingrese un ejercicio");

        Scanner lector = new Scanner(System.in);
        int Ejercicio = lector.nextInt();

        if (Ejercicio == 1) {
            System.out.println("1. Imprimir los números del 1 al 50 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 1");

        }
        if (Ejercicio == 2) {
            System.out.println("2. Mostrar los números del 50 al 1 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 2");
            for (int i = 50; i >= 1; i--) {
                System.out.println("Numero " + i);
            }

        }
        if (Ejercicio == 3) {
            System.out.println("Ingreso al Ejercicio 3");

        }
        if (Ejercicio == 4) {
            System.out.println("Ingreso al Ejercicio 4");

        }
        if (Ejercicio == 5) {
            System.out.println("Ingreso al Ejercicio 5");

        }

        if (Ejercicio == 6) {
            System.out.println("6. Calcular la suma de los números impares del 1 al 50 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 6");

            int Suma = 0;
            for (int i = 0; i <= 50; i++) {
                if (i % 2 != 0) {
                    Suma = Suma + i;
                    System.out.println("Sumando " + Suma);
                }
            }
            System.out.println("El Resultado es " + Suma);

        }
        if (Ejercicio == 10) {
            System.out.println(
                    "10. Mostrar los números del 1 al 100 que sean divisibles entre 3 y 5 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 10");

            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.println("El Numero " + i + " Es divisible entre 5 y3 ");
                }
            }

        }

        if (Ejercicio == 11) {
            System.out
                    .println("11. Calcular el factorial de un número almacenado en una variable usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 11");
            System.out.println("Ingrese el numero para sacar el factorial");
            int Factorial = lector.nextInt();
            System.out.println("Vamos a sacar el factorial del numero" + Factorial);
            for (int i = 2; i <= Factorial; i++) {
                Factorial = Factorial * i;
            }
            System.out.println("El Factorial del numero ingresa es " + Factorial);

        }
        if (Ejercicio == 12) {
            System.out.println("12. Recorrer un arreglo de 10 números e imprimir cada elemento usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 12");
            int[] arreglo = new int[10];

            System.out.println("Vamos a llenar el vector");

            for (int j = 0; j < arreglo.length; j++) {
                System.out.println("Ingrese el valor del arreglo en la posicion " + j);
                arreglo[j] = lector.nextInt();
            }

            System.out.println("Vamos a recorrer el arreglo");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }

        }
        if (Ejercicio == 13) {
            System.out.println("Ingreso al Ejercicio 13");

        }
        if (Ejercicio == 14) {
            System.out.println("14. Encontrar el número mayor dentro de un arreglo usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 14");
            int[] Vector = { 1, 2, 3, 4 };
            int Mayor = 0;
            for (int i = 0; i <= Vector.length; i++) {
                if (Vector[i] > Mayor) {
                    Mayor = Vector[i];
                }
            }

        }

        if (Ejercicio == 15) {
            System.out.println("15. Encontrar el número menor dentro de un arreglo usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 15");

            System.out.println("Ingrese el tamano del vector");
            int tamano =lector.nextInt();

            int [] vector =new int [tamano];

            System.out.println("Vamos Llenar los datos del vector");

            for(int i =0 ;i<vector.length;i++){
                System.out.println("Ingreso valor Vector en posicion "+i);
                vector[i]=lector.nextInt();
            }

            int menor =999999999;

            for (int j =0;j<vector.length;j++){
                System.out.println(vector[j]);
                if (menor>vector[j]){
                    menor = vector[j];
                }

            }
            System.out.println("La posicion menor del vector es "+menor);

        }
        if (Ejercicio == 1) {
            System.out.println("1. Imprimir los números del 1 al 50 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 1");

        }
        if (Ejercicio == 1) {
            System.out.println("1. Imprimir los números del 1 al 50 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 1");

        }
        if (Ejercicio == 1) {
            System.out.println("1. Imprimir los números del 1 al 50 usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 1");

        }
        if (Ejercicio == 17) {
            System.out.println("17. Imprimir un triángulo de asteriscos de altura 5 usando ciclos for anidados.");
            System.out.println("Ingreso al Ejercicio 17");
            System.out.println("Imprimiendo Triangulo");
            String[] vector = { "*", "*", "*", "*", "*" };
            for (int j = 1; j <= vector.length; j++) {
                for (int z = 1; z <= j; z++) {
                    System.out.print(vector[j]);
                }
                System.out.println();
            }

        }
        if (Ejercicio == 18) {
            System.out.println("18. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.");
            System.out.println("Ingreso al Ejercicio 18");

            for (int i = 1; i <= 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        if (Ejercicio == 19) {
            System.out.println("19. Mostrar los primeros 20 números y su cubo usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 19");
            for (int i = 0; i <= 20; i++) {
                System.out.println("El Numero " + i + "Su Cubo es " + (i * i * i));
            }
        }
        if (Ejercicio == 20) {
            System.out.println("20. Recorrer una cadena de texto e imprimir cada carácter usando un ciclo for.");
            System.out.println("Ingreso al Ejercicio 20");
            System.out.println("Ingrese una cadena de texto para imprimirla");
            String Cadena = lector.next();

            int Tamano = Cadena.length();
            System.out.println("Vamos imprimir la cadena " + Cadena);
            for (int i = 0; i <= Tamano; i++) {
                System.out.println(Cadena.charAt(i));
            }

        }

        if (Ejercicio > 20 || Ejercicio < 1) {
            System.out.println("Ingreso una Opcion No Validad");
        }

    }
}
