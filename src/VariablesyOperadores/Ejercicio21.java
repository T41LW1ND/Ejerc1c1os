package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /* Realiza un programa que pida las notas de las tres evaluaciones del módulo
Programación y muestre la nota final (la nota final es la media de las tres
evaluaciones).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota de la primera evaluación: ");
        double n1ev = sc.nextDouble();
        System.out.println("Introduce la nota de la segunda evaluación: ");
        double n2ev = sc.nextDouble();
        System.out.println("Introduce la nota de la tercera evaluación: ");
        double n3ev = sc.nextDouble();


        double media = (n1ev + n2ev + n3ev) / 3;
        //queremos mostrar 2 decimales solo
        System.out.printf("La media de las tres evaluaciones es %.2f", media);
    }
}
