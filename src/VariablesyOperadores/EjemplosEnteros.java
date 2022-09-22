package VariablesyOperadores;

import java.util.Scanner;

public class EjemplosEnteros {
    public static void main(String[] args) {
        // pedir por teclado dos números y guardarlos en variables de tipo entero
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();
        // Crear variables que guarden el resultado de las cinco operaciones posibles
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2; // !! es el COCIENTE de la división entera
        int resto = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println("El producto de " + num1 + " multiplicado por " + num2 + " es " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println("El cociente de " + num1 + " dividido entre " + num2 + " es " + cociente);
        System.out.println(num1 + " % " + num2 + " = " + resto);
        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es " + resto);


    }
}
