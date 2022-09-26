package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        int horas = minutos / 60;
        int minutosrestantes =  minutos % 60;
        System.out.println(minutos + " minutos equivalen a " + horas + " horas/s y " + minutosrestantes + " minutos.");
    }
}
