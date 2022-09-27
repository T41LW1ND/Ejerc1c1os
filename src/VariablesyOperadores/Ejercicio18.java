package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
    /* Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:

Reamur = Centígrados x 0.8
Fahenheit = (Centígrados * 9/5)+32
Kelvin = Centígrados + 273*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual en grados: ");

        double centigrados = sc.nextDouble();

        double reamur = centigrados * 0.8;
        System.out.println("Grados expresados en Reamur: " + reamur + " ºRé.");

        double fahrenheit = (centigrados * 9/5) + 32;
        System.out.println("Grados expresados en Fahrenheit: " + fahrenheit + " ºF.");

        double kelvin = centigrados + 273;
        System.out.println("Grados expresados en Kelvin: " +  kelvin + " Ks.");
    }
}
