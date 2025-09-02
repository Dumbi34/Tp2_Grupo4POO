package ar.edu.unju.escmi.tp2.ejercicio8;

public class Ejercicio8 {
    /*Utilice los operadores de asignación para
     la suma (+=), resta (-=), división (/=) y multiplicación (/=) de las siguientes variables de tipo int:  
     int a=5, b=10, c=2, d= 6; a+=5; b-=2; c*=3; d/=2; 
     Mostrar el valor de cada variable antes de usar los operadores de asignación y luego mostrar el resultado de las operaciones.*/ 

    public static void main(String[] args) {

        int a = 5, b = 10, c = 2, d = 6;
        System.out.println("Valores de iniciacion:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        a += 5;
        b -= 2;
        c *= 3;
        d /= 2;
        System.out.println("Valores después de las op:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
