package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /* Escribe un programa que lea un número de tres cifras */

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        /*y muestre el número invertido.
         Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
         introducimos 976, el programa debe mostrar 679.*/

        int centena = numero / 100;
        int resto = numero % 100; // en este resto están decenas y unidades
        int decenas = resto / 10;
        int unidades = resto % 10;
        System.out.println(unidades + " " + decenas + " " + resto);
    }
}
