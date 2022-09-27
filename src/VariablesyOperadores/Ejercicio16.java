package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /* Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
del lado por cuatro). */

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el lado del cuadrado: ");

        int lado = sc.nextInt();

        int perimetro = lado * 4;

        System.out.println("El perímetro del cuadrado es " + perimetro + " cms.");

        System.out.println("Perímetro: " +  perimetro + "cms");



    }
}
