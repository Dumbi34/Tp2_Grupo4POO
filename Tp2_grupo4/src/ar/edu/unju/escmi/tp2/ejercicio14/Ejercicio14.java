package ar.edu.unju.escmi.tp2.ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Ingrese 8 números enteros para llenar el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
        }
        scanner.close();
    }
}
