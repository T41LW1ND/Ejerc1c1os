package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        System.out.print("Introduce el cuarto número: ");
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma entre el primer y segundo número es: " + suma);
        int producto = num3 * num4;
        System.out.println("La multiplicación entre el tercer y cuarto número es: " + producto);

        System.out.println(" ");
    }
}
