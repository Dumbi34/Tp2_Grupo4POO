package ar.edu.unju.escmi.tp2.ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        int num = 3;

        int base = (num * (num + 1)) / 2;
        double resultado = Math.pow(base, 2);
        
        System.out.println("El resultado de (num * (num + 1) / 2)^2 para num = " + num + " es: " + resultado);
    }
}