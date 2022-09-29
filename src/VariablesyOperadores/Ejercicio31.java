package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
         /* Escribe un programa que lea un valor por teclado
          */

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
         // y verifique si es menor que 10

        boolean algo= valor < 10;

        System.out.println("¿Es " + valor + "mayor que 10? " + algo );
    }
}
