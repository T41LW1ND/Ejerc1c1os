package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        /* Escribe un programa que lea un valor entero y verifique si es menor  que 10 y mayor que 0.
        El programa debe imprimir un booleano (true or false)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = sc.nextInt();
        boolean entero = 0 < n1 && n1 < 10;
        System.out.println(entero);
    }
}
