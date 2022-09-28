package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /* 28. Escribe un programa que lea cuatro números por teclado*/

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();;

        // y decremente cada uno de ellos. El programa debe mostrar los resultados en la misma línea, en el mismo orden
        // que entraron, separados por espacios
        n3 -= 1; // no  se puede meter así dentro del sout
        n4--; // no se mete dentro del sout porque imprime primero el número antes de incrementarse
        System.out.println((n1 - 1) + " " + --n2 + " " + n3 + n4);
    }
}
