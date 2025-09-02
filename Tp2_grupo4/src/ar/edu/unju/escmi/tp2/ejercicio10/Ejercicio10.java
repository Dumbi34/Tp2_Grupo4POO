package ar.edu.unju.escmi.tp2.ejercicio10;


public class Ejercicio10 {
    /* Ejercicio10: Dadas las variables de tipo int con valores a = 7, b = 5, c = -14  
    Indicar si la evaluación de estas expresiones daría como resultado verdadero o falso (mostrar por consola el resultado):  */
    public static void main(String[] args) {

        int a = 7, b = 5, c = -14;

        System.out.println("a > 3: " + (a > 3));
        System.out.println("a > c: " + (a > c));
        System.out.println("a < c: " + (a < c));
        System.out.println("b < c: " + (b < c));
        System.out.println("b != c: " + (b != c));
        System.out.println("a == 3: " + (a == 3));
        System.out.println("a * b == 15: " + (a * b == 15));
        System.out.println("a * b == -30: " + (a * b == -30));
        System.out.println("c / b < a: " + (c / b < a));
        System.out.println("c / b == -10: " + (c / b == -10));
        System.out.println("c / b == -4: " + (c / b == -4));
        System.out.println("a + b + c == 5: " + (a + b + c == 5));
        System.out.println("(a+b == 8) && (a-b == 2): " + ((a + b == 8) && (a - b == 2)));
        System.out.println("(a+b == 8) || (a-b == 6): " + ((a + b == 8) || (a - b == 6)));
        System.out.println("a > 3 && b > 3 && c < 3: " + (a > 3 && b > 3 && c < 3));
        System.out.println("a > 3 && b >= 3 && c < -3: " + (a > 3 && b >= 3 && c < -3));
    }
}


