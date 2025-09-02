package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
      /*Ejercicio 9:   Solicitar al usuario que ingrese por consola un año, ejemplo: 2010. 
    Determinar si ese año es un año bisiesto. Mostrar el mensaje por consola indicando si es o no un año bisiesto.
     Un año es bisiesto cuando en vez de tener 365 días, tiene 366 que es cuando el mes de Febrero tiene 29 días. 
     Podemos utilizar la siguiente regla para determinar si un año es bisiesto o no, debe de cumplir una serie de condiciones: 
      El año debe ser divisible por 4, pero no divisible por 100, o el año debe ser divisible por 400. 
    Si cumple estas condiciones el año es bisiesto*/ 
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año xfavor: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {

            System.out.println(anio + " Es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();
    }
}


