package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /* 6. A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de
        mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una
        fiesta de la marmota exitosa tendrá entre 10 y 20 tazas de mantequilla de cacahuete,
                ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25
        tazas.
                Escribe un programa que lea dos valores:
• El primero es el número de tazas de mantequilla de cacahuete que hay en la
        fiesta.*/
        Scanner sc = new Scanner(System.in);
        int tazas = sc.nextInt();


    /*El segundo es un booleano que indica si es fin de semana.
        El programa debe imprimir si la fiesta tiene éxito o no (true o false).*/

        boolean finde = sc.nextBoolean();

        //Empezamos declarando una variable éxito

        boolean exito; // en variables tipo primitivo se coge el valor por defecto (false)

        if (tazas >= 10 && tazas <= 20 && finde == false) {
            exito = true;
        } else if (finde == true && tazas >= 15 && tazas <= 25) {
            exito = true;
        } else {
            exito = false;
        }

        System.out.println(exito);

    }
}
