package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /* Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el
plano. Calcula y muestra la distancia entre ellos. */
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        System.out.println("Introduce el primer número: ");
        double x2 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double y1 = sc.nextDouble();
        System.out.println("Introduce el tercer número: ");
        double y2 = sc.nextDouble();
        System.out.println("Introduce el cuarto número: ");

        double plano = Math.sqrt((x2 - x1)Math.pow(2) + (y2 - y1)Math.pow(2));

        System.out.println("El punto establecido es: " + plano + ".");
    }
}
