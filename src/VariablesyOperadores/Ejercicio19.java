package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /* Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el
plano. Calcula y muestra la distancia entre ellos. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double x1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double y1 = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double x2 = sc.nextDouble();
        System.out.print("Introduce el cuarto número: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.println("El punto establecido entre A (" + x1 + ", " + y1 + ")" + " y B (" + (x2 + ", " + y2) + ") es " + distancia + ".");
    }
}
