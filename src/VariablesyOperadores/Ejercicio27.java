package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /* 27. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
        calificación se compone de los siguientes porcentajes:
        a. 55% del promedio de sus tres calificaciones parciales.
        b. 30% de la calificación del examen final.
        c. 15% de la calificación de un trabajo final.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del examen parcial de evaluación");
        double primerparcial = sc.nextDouble();
        System.out.println("Introduce la nota del examen parcial de evaluación");
        double segundoparcial = sc.nextDouble();
        System.out.println("Introduce la nota del examen parcial de evaluación");
        double tercerparcial = sc.nextDouble();
        System.out.println("Introduce la nota del examen final de evaluación");
        double examenfinal = sc.nextDouble();
        System.out.println("Introduce la nota del trabajo");
        double trabajo = sc.nextDouble();

        // double porcentajeparcial = ((primerparcial + segundoparcial + tercerparcial)/3) * 55/100;
        double mediaparcial = (primerparcial + segundoparcial + tercerparcial) / 3;
        double porcentajeparcial = mediaparcial * 55/100;

        double porcentajefinal = examenfinal * 30/100;

        double trabajofinal = trabajo * 15/100;

        double notafinal = porcentajeparcial + porcentajefinal + trabajofinal;
        System.out.printf("La calificación final será  %.2f", notafinal);


    }

}
