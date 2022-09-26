package VariablesyOperadores;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.
        // fórmula es 2 * pi * r
        double radio = 3;
        //NEW: el número pi lo podemos poner directamente como Math.PI

        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);
        // NEW para mostrar un número de muchos decimales con solo 2
        System.out.printf("%.2f", circunferencia);
    }
}
