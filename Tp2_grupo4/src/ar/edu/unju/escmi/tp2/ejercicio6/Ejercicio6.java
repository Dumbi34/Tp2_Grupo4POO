package ar.edu.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

/*Ejercicio 6 del tp2:  
 Solicite al usuario que ingrese por consola el valor del radio de un círculo (tipo de dato byte [128, 127]),
luego con ese valor calcular el área del círculo y mostrar el resultado por consola.
 Puede utilizar la constante PI y el método pow() de la clase Math Math.PI = 3,14159265358979323 Área de un círculo = 𝝅∗𝒓𝟐 */
public class Ejercicio6 {
public static void  main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresá el valor del radio del círculo (entre -128 y 127): ");
        byte radio = scanner.nextByte();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        scanner.close();
    }
}
