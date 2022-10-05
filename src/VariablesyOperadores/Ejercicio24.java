package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
        productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
        importe a abonar.*/

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Introduce la cantidad de productos comprados: ");
        int cantidad = sc.nextInt();
        System.out.println("Introduce el iva: ");
        double iva = sc.nextDouble();


        double iva1 = (iva / 100) * precio;
        double preciofinal = precio + iva1;
        double final1= preciofinal * cantidad;
        System.out.println("Debe abonar " + final1 + " euros.");


        }
    }

