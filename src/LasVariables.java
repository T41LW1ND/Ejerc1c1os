public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a = 5; // Declaro la variable a y a continuación guardo el valor fijo
        System.out.println ("la variable a vale " + a);
        // su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println ("la variable a vale " + a);
        //Reglas para nomnrar variables
        //No puede comenzar por ningún dígito
        // int 5c = 4; --> no compila
        //Puede contener cualquier letra o dígito
        // int c58 = 2
        //No puede contener ningún caracter especial (signos de puntuación... a excepción de _ y $
        //int _variable = 3
        //int $otravariable = 4
        //No puede contener espacios
        //int otra variable; --> no compila
        //Hay que darle siempre un nombre a una variable

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("=============");
        System.out.println("Las variables se declaran poniendo primero el tipo de variable que es y el segundo el nombre que le damos a la variable");
        System.out.println("Variables para números enteros pequeños: byte, short, ");
        System.out.println("byte");
        byte variableBytePos = 127; // es el número más grande que puedo guardar en una variable tipo byte
        byte variableByteNeg = -128; // es el número más pequeño que puedo guardar en una variable tipo byte

        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        //byte = 8 bits
        //short = 16 bits
        //int = 32 bits
        //long = 64 bits
        System.out.println("Numeros con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; //si declaras una variable de tipo float hay que escribir siempre una f

        //Formas alternativas de declarar una variable (pag 11)
        String lenguaje = "java";
        String version = "8 o superior";
        // esto también se puede hacer así:
        String lenguaje1 = "java", version1 = "10 o superior";
        int num1 = 5, num2= 10; // declaro dos variables de tipo int en la misma línea
        //también podría hacer:
        int num3; //aquí declaro la variable sin asignar nad, coge el valor por defecto; en los números, 0
        num3 = 6;
        num3 = num1;
        System.out.println(num3);
        // Inferencia de tipos
        var variable = "hola";
        var otravariable = 10;
        var var = "Toma";

    }
}
