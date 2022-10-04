package estructurasdecontrol;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        // si la edad es mayor que 100 es una persona con mucha experiencia
        // si no, pues nada, no decimos nada

        if (edad > 100) {
            System.out.println("Eres una persona con mucha experiencia.");
        }
         if (edad < 100) {
            System.out.println("Careces de experiencia, la verdad.");
        }*/
        //el resultado de la condición es boolean; podemos simplificar a veces de esta forma

       /* boolean semaforoabierto= false;
        if (semaforoabierto){ // es lo mismo que semaforoabierto == true
            System.out.println("Adelante, puedes pasar.");
        } else {
            System.out.println("Detente, pecador.");
        }*/

        //vamos a ver si un número es par o impar

        /*System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");}
        else {
            System.out.println("El número es impar.");*/
    int presupuesto = sc.nextInt();
    if (presupuesto < 100) {
        System.out.println("Esto no es para mí.");
    } else if (presupuesto >= 100 && presupuesto < 200) {
        System.out.println("Me compraré el paquete básico.");
    } else if (presupuesto >= 200 && presupuesto < 300) {
        System.out.println("Me compraré el paquete estándar.");
    } else {
        System.out.println("Me compro lo que quiera.");
    }


    }
}
