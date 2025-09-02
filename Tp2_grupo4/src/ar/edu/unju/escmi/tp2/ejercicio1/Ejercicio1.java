package ar.edu.unju.escmi.tp2.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        // dni
        int dni = 45789632;
        // letra ejemplar del DNI
        char ejemplarDNI = 'A';
        // edad de mi mamá/papá o abuela/abuelo
        byte edadMama = 52;
        // nombres y apellidos de un prócer argentino
        String procer = "José de San Martín";
        // número que puede salir en un bingo
        int numeroBingo = 27;
        // precio de un celular
        double precioCelular = 350000.50;
        // estatura en metros
        float estatura = 1.68f;
        // peso aproximado de mi mascota
        double pesoMascota = 12.3;
        // fecha de inicio del 2do cuatrimestre
        String fechaInicioCuatrimestre = "12/08/2025";
        // fecha de fin del 2do cuatrimestre
        String fechaFinCuatrimestre = "30/11/2025";

        // mostrando valores en consola
        System.out.println("DNI: " + dni);
        System.out.println("Ejemplar del DNI: " + ejemplarDNI);
        System.out.println("Edad de mi mamá: " + edadMama + " años");
        System.out.println("Prócer argentino: " + procer);
        System.out.println("Número de bingo: " + numeroBingo);
        System.out.println("Precio de un celular: $" + precioCelular);
        System.out.println("Mi estatura: " + estatura + " metros");
        System.out.println("Peso de mi mascota: " + pesoMascota + " kg");
        System.out.println("Inicio del 2do cuatrimestre: " + fechaInicioCuatrimestre);
        System.out.println("Fin del 2do cuatrimestre: " + fechaFinCuatrimestre);
    }
}