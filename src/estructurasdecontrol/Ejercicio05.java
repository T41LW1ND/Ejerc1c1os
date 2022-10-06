package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //vamos a usar dos variables auxiliares: max y min
        //en max vamos a ir guardando temporalmente el num mayor que tengamos
        //en min vamos a ir guardando temporalmente el número menor que tengamos
        System.out.println("Número 1:");
        int num1 = sc.nextInt();
        // al pedir el primer número ese es el mayor y el menor que tenemos de momento, así que lo asignamos a estas variables
        int max = num1;
        int min = num1;
        System.out.println("Número 2: ");
        int num2 = sc.nextInt();//si n2 es mayor que el que teníamos lo guardamos en max
        if (num2 > max) {
            max = num2;
        }
        if (num2 < min) {
            min = num2;
        }
        System.out.println("Número 3:");
        int num3 = sc.nextInt();
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("Número: ");
        int num4 = sc.nextInt();
        if (num4 > max) {
            max = num4;
        }
        if (num4 < min) {
            min = num4;
        }
        System.out.println("Número:");
        int num5 = sc.nextInt();
        if (num5 > max) {
            max = num5;
        }
        if (num5 < min) {
            min = num5;
        }
        System.out.println("Número 6:");
        int num6 = sc.nextInt();
        if (num6 > max) {
            max = num6;
        }
        if (num6 < min) {
            min = num6;
        }
        System.out.println("Número 7:");
        int num7 = sc.nextInt();
        if (num7 > max) {
            max = num7;
        }
        if (num7 < min) {
            min = num7;
        }
        System.out.println("Número:");
        int num8 = sc.nextInt();
        if (num8 > max) {
            max = num8;
        }
        if (num8 < min) {
            min = num8;
        }
        System.out.println("Número:");
        int num9 = sc.nextInt();
        if (num9 > max) {
            max = num9;
        }
        if (num9 < min) {
            min = num9;
        }
        System.out.println("Número:");
        int num10 = sc.nextInt();
        if (num10 > max) {
            max = num2;
        }
        if (num10 < min) {
            min = num2;
        }
        System.out.println("El número mayor es " + max + ".");


    }
}
