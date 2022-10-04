package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /* 2. Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
impuestos. Si no lo supera, que indique que no debe abonarlos.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sueldo: ");
        double sueldo = sc.nextDouble();
        if (sueldo > 9000) {
            System.out.println("Te toca pagar impuestos.");
        } else {
            System.out.println("No te toca pagar impuestos.");
        }
    }
}
