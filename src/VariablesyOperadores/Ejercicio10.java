package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //10. Dado un número de dos dígitos, imprime su primer número (las decenas)

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de dos dígitos: ");
        int numero = sc.nextInt();

        //las decenas son el cociente de una división
        System.out.println( "Las decenas son: " + (numero / 10));
        System.out.println("Y las unidades, " + (numero % 10));

    }
}
