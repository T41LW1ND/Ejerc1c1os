package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /* 5. Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}
