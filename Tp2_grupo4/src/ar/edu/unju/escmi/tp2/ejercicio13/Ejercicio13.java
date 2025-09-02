package ar.edu.unju.escmi.tp2.ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes;

        do {
            System.out.print("Ingrese un número de mes (1-12) o cualquier otro para salir: ");
            mes = scanner.nextInt();
            
            String nombreMes;
            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    break;
                case 2:
                    nombreMes = "Febrero";
                    break;
                case 3:
                    nombreMes = "Marzo";
                    break;
                case 4:
                    nombreMes = "Abril";
                    break;
                case 5:
                    nombreMes = "Mayo";
                    break;
                case 6:
                    nombreMes = "Junio";
                    break;
                case 7:
                    nombreMes = "Julio";
                    break;
                case 8:
                    nombreMes = "Agosto";
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    break;
                case 10:
                    nombreMes = "Octubre";
                    break;
                case 11:
                    nombreMes = "Noviembre";
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    break;
                default:
                    System.out.println("No existe ese mes.");
                    scanner.close();
                    return; // Finaliza la ejecución del programa
            }
            System.out.println("El número " + mes + " corresponde al mes de " + nombreMes + ".");
        } while (true);
    }
}
