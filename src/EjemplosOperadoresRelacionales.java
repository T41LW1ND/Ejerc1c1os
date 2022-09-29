import java.util.Scanner;

public class EjemplosOperadoresRelacionales {
    public static void main(String[] args) {
        //Sirven para comparar dos números (normalmente) dan como resultado un boolean
        int num1 = 35;
        int num2 = 25;

        num2 = num1; // estoy asignando a num2 el valor de num1

        boolean comparacion = num2 == num1; // estoy comparando valores de num 1 y 2 y el resultado (true) lo asigno a la comparación

        boolean otracomparacion = num2 != num1;

        int nueve = 9;
        int otronueve = 9;
        int diez = 10;
        System.out.println(nueve > otronueve);
        System.out.println(nueve >= otronueve);

        int edad = 18;
        System.out.println("¿Mayor de edad?" + (edad >= 18));
        System.out.println("¿Mayor de edad?" + (edad > 17));

        // cuando aparecen operadores mezclados de distinto tipo
        /*Cuando tenemos en la misma expresión paréntesis, operadores aritméticos y operadores
        lógico, es normal preguntarse en qué orden debemos realizar las operaciones.*/
        //El orden de prioridad de los elementos en la sintaxis de Java es éste:
        //1o) Paréntesis
        //2o) Incrementos y decrementos (++ y --)
        //3o) Operadores aritméticos (en el orden habitual: primero * y /, después + y -)
        //4o) Operadores relacionales (>, >=, ==, etc.)
        //5o) Operadores lógicos (en el orden indicado: !, ^, &&, ||)
        int num = 1000;
        boolean resultado = num + 10 > num + 9; // 1010 > 1009

        // unir operaciones relacionales usando operadores lógicos
        int a = 5;
        int b = 6;
        int c = 7;
        //quiero saber si a <= b <= c
        //System.out.println(a <=  b <= c); // esto así no se puede poner en java
        // hay que hacer la comparación de dos en 2 con 'and'
        System.out.println(a <= b && b <= c);
        //ejemplo: pedimos tres estaturas por teclado y quqeremos ver si están en orden ascendente
        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        //boolean ordenascendente =
        boolean ordenascendente = estatura1 <= estatura2 && estatura2<= estatura3;
        System.out.println("Orden ascendente: " + ordenascendente);

        //también comprobamos si están en orden descendente
        boolean ordendescendente = estatura1 >= estatura2 && estatura2 >= estatura3;
        System.out.println("Orden descendente: " + ordendescendente);


        //también comprobamos si están en orden descendente


    }
}
