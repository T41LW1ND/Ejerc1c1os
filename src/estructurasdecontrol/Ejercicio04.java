package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*4. Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
        ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
        a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
        bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
                b. false, en caso contrario.
        Escribe el código necesario.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce el nivel de estudios: ");
        int nivel = sc.nextInt();
        System.out.println("Introduce tus ingresos: ");
        int ingresos = sc.nextInt();

       /* if (edad <= 28) {
            System.out.println("");
        } if else (edad < 30); {
            System.out.println("");
        } else {
            System.out.println("");
        }*/

    }
}
