package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        /* 11. Dado un número de dos cifras, escribe un programa que permita obtener el número
invertido. Ejemplo, si se introduce 23 que muestre 32. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona un número de dos cifras: ");

        int numero = sc.nextInt();
        int decenas = numero / 10;
        int unidades = numero % 10;

        System.out.println(unidades + "" + decenas);


    }
}
