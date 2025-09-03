package ar.edu.unju.escmi.tp2.ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanio;
          System.out.println();
        do {
            System.out.print("Ingrese un número entero en el rango [3,10] para el tamaño del array: ");
            tamanio = scanner.nextInt();
            if (tamanio < 3 || tamanio > 10) {
                System.out.println("Número fuera de rango. Intente de nuevo.");
            }
        } while (tamanio < 3 || tamanio > 10);

        int[] numeros = new int[tamanio];
        int suma = 0;

        System.out.println("\nAhora, ingrese " + tamanio + " números enteros para llenar el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("\nLa suma de todos los valores es: " + suma);
        scanner.close();
    }

}
