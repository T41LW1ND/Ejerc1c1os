package VariablesyOperadores;

public class Ejercicio07 {
    public static void main(String[] args) {
        /* 6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto. */

        int n = 10;
        int k = 22;
        System.out.println( n + " ardillas encuentran " + k + " nueces y deciden dividirlas equitativamente.");
        int cociente = k / n;
        int resto = k % n;
        System.out.println("Al final, sobran " + resto + " y " + cociente + " corresponden a cada ardilla.");
    }
}
