package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /* 25. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
desea saber cuanto deberá pagar finalmente por su compra.*/

        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();

        double descuento = 15/100 * precio;
        double preciofinal = precio - descuento;
    }
}
