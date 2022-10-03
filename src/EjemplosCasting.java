public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puede asignar un int a long sin más (casting implícito)

        //¿y al revés?

        long numGrande2 = 101; // long ocupa 64 bits
        int entero = (int) numGrande2; //casting es poner entre paréntesis un tipo de variable que quieres que te convierta.
        // esto es un casting explícito

        //de int a short
        // short numeroCorto = num; // no se puede hacer directamente porque int son 32 bits y no caben en 16 bits
        //para convertirlo:
        short numeroCorto = (short) num;

        //de char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        // de float a double

        float decimal = 3.1416f; // con float es obligatorio poner f al final, si no no funciona
        double decimalDoble = decimal;

        //de double a float

        double decimalDoble2 = 3.1234567;
        float decimalF = (float) decimalDoble2;

        // de double a int

        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits); //resultado imprevisible

        // de double a short

        short entero16bits = (short) decimalDoble2;
        System.out.println(entero16bits);

        //



    }
}
