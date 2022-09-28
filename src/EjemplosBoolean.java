public class EjemplosBoolean {
    public static void main(String[] args) {
        boolean apto = false;
        System.out.println("¿Es apto? " + apto);

        // operadores lógicos
        // Unario: ! NOT

        //apto = !apto;
        System.out.println(!apto);

        // operadores binarios: se utilizan con dos variables
        // AND = &&
        System.out.println("AND");
        System.out.println("===");
        boolean v1 = true;
        boolean v2 = false;
        boolean and = v1 && v2;
        System.out.println(and);

        // OR = ||

        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        // XOR = ^

        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);

        boolean frio = false; // no hace frío
        boolean seco = true; // hace tiempo secoc
        boolean verano = false; // no estamos en verano
        boolean trekking = seco && (!frio || verano); // true, nos vamos de trekking





    }
}
