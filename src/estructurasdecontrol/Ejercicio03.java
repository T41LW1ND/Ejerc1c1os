package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /* 3. Escribe un programa que pida dos números e indique si el primero es mayor que el
segundo o no.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es definitivamente mayor que " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println(num1 + " es menor que " + num2 + ".");
        }
    }
}
