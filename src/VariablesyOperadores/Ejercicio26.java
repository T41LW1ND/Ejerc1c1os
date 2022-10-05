package VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

    /* 26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
su sueldo base y comisiones.*/

        // variables: sueldobase, comisión ventas, número de ventas.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo base: ");
        double sueldobase = sc.nextDouble();

        System.out.println("Introduce la primera venta");
        double venta1 = sc.nextDouble();
        double comision1 = venta1 * 10/100;

        System.out.println("Introduce la segunda venta");
        double venta2 = sc.nextDouble();
        double comision2 = venta2 * 10/100;

        System.out.println("Introduce la tercera venta");
        double venta3 = sc.nextDouble();
        double comision3 = venta3 * 10/100;

        double comisiontotal = comision1 + comision2 + comision3;
        System.out.println(comisiontotal);
        double comisionybase = sueldobase + comisiontotal;
        System.out.println(comisionybase);

        double comisionfinal = (venta1 + venta2 + venta3) * 10/100;
        System.out.println(comisionfinal);

        //no poner paréntesis

        double totalfinal = sueldobase + comisionfinal;
        System.out.println(totalfinal);


    }
}
