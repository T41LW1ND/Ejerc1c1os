package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("MOMENTO INICIAL");
        System.out.println("=====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora:");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos1 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos1 = sc.nextInt();

        // El truco es pasar los segundos el momento inicial y el momento final
        // HALLAR la diferencia entre ambos
        // de esa diferencia (en segundos) extraer horas, minutos y segundos
        System.out.println("MOMENTO FINAL");
        System.out.println("=====");
        System.out.println("Introduce la hora:");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos2 = sc.nextInt();

        System.out.println("Datos introducidos: momento inicial: " + hora1 + ":" + minutos1 + ":" + segundos1 + "\t" + "momento final: " + hora2 + ":" + minutos2 + ":" + segundos2);

        //pasamos a segundos el momento inicial:

        int horainicialsegundos = hora1 * 60 * 60;
        int minutoinicialsegundos = minutos1 * 60;
        int momentoinicial = horainicialsegundos + minutoinicialsegundos + segundos1;
        System.out.println(momentoinicial);

        int horafinalsegundos = hora2 * 60 * 60;
        int minutofinalsegundos = minutos2 * 60;
        int momentofinal = horafinalsegundos + minutofinalsegundos + segundos2;
        System.out.println(momentofinal); //muestro por pantalla para ver si voy bien

        int difererenciaensegundos = momentoinicial - momentofinal;

        System.out.println("La diferencia es: " + difererenciaensegundos);

        // de esa diferencia extraer horas minutos y segundos

        int minutos = difererenciaensegundos / 60; // puede contener X horas
        int segundos = difererenciaensegundos % 60;
        int horas = minutos / 60;
        // el resto son los minutos que quedan
        int minutosfinales = minutos % 60;
        System.out.println( "La diferencia entre ambos momentos es:" horas + ":" + minutos + ":"+ segundos);






    }
}
