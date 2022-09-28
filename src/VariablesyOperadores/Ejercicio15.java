package VariablesyOperadores;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        15. Realiza un programa que calcule el área de una circunferencia de radio 5,2
centímetros.
         */
        // Fórmula: pi + radio al cuadrado
        double radio = 5.2;
        double area = Math.PI * Math .pow(5.2,2);
        //double area = Math.PI * Math .pow(radio, 2)
        System.out.println("El resultado es %.2f" + area);
    }
}
