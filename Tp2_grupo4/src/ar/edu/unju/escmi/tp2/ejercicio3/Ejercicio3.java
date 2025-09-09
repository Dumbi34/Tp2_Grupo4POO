package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        final int CODIGO_POSTAL_JUJUY = 4600;
        final double PI = 3.1415926535;
        final int DIAS_SEMANA = 7;
        final int MESES_ANIO = 12;

        System.out.println("Código postal de Jujuy: " + CODIGO_POSTAL_JUJUY);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Cantidad de días en la semana: " + DIAS_SEMANA);
        System.out.println("Cantidad de meses en un año: " + MESES_ANIO);
    }
}
//No hace falta usar la palabra static en este caso, ya que las constantes están
//definidas dentro del método main, y por lo tanto pueden utilizarse directamente
//dentro de ese mismo método sin ningún problema.