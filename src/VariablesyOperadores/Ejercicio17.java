package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /* Calcular el área de un triangulo ( base * altura)/2. Resuelve el ejercicio primero con
        variables de tipo entero y después con variables de tipo float.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        //calculamos
        double area = (base * altura)/2;
        //mostramos resultado
        System.out.println("Área: " +  area + ".");


    }
}
