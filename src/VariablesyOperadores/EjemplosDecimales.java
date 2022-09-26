package VariablesyOperadores;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {

        // Tipo double
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNegativo = -1.4567;

        // Tipo float
        float decimalFloat = 1.3f;
        float decimalLargo = -3.12334553579056f;
        System.out.println(decimalLargo);

        // Notación científica
        double eps = 5e-3; // es lo mismo que 5 * 10^(-3) = 0.005
        System.out.println(eps);
        double n = 0.0e2;
        System.out.println(n);

        // Operaciones aritméticas

        System.out.println("Suma: " + (eps + n));
        System.out.println("Resta: " + (eps - n));
        System.out.println("Producto: " + (eps * n));
        System.out.println("División: " + (eps / n));
        // no tiene sentido hacer el % resto

        // ¿Qué pasas si divido números enteros y los guardo en una variable con decimales?

        double d1 = 5 / 4; // divide dos números enteros (división entera) y la asigna a la variable decimal
        System.out.println("División 1: " + d1);
        double d2 = 5.0 / 4.0; // divide dos números decimales (división decimal)
        System.out.println("División 2: " + d2);

        // Falta de precisión con las variables primitvas decimales
        System.out.println(3.3 / 3); // imprime 1.0999999999999999

        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d);

        //Leer desde teclado
        Scanner sc = new Scanner(System.in);
        float decimalporteclado = sc.nextFloat(); // los números decimales se meten con "," (coma
        System.out.println(decimalporteclado);
        double doubleporteclado = sc.nextDouble();
        System.out.println(doubleporteclado);



    }
}
