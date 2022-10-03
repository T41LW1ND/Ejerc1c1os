package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /* Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
media. Ten en cuenta que la media puede contener decimales.*/

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double num4 = sc.nextInt();

        double media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("La media de los números proporcionados es " + media);

    }
}
