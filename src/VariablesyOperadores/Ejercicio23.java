package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*23. Realiza un programa que pida un número y un porcentaje, y
a. Calcule y muestre ese número incrementado en ese porcentaje.
b. Calcule y muestre ese número decrementado en ese porcentaje..*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero = sc.nextDouble();
        System.out.println("Introduce un porcentaje: ");
        double porcentaje = sc.nextDouble();

        double porcentajefinal = (porcentaje / 100) * numero;
        System.out.println(porcentajefinal);

        double incrementado = porcentajefinal + numero;
        System.out.println(incrementado);
        double decrementado = numero - porcentajefinal;
        System.out.println(decrementado);
    }
}
