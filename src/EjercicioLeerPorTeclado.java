import java.util.Scanner;

public class EjercicioLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Ahora ya podemos meter datos por teclado
        //Pero para poder utilizarlos después en el programa
        // tenemos que guardarlos en una variable
        // las variables que guardan palabras o cadenas de texto se llaman string
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola," + nombre);
        System.out.println("Introduce tus apellidos: ");
        //crea otra variable para guardar el apellido que va a entrar por teclado
        String apellidos = sc.nextLine();
        System.out.println("Hola, " + nombre + " " + apellidos);
        System.out.println("¿Cuántos años tienes: ");

        int edad = sc.nextInt( );
         /* este método nextint() tiene un peligro: si a continuación pones un nextline se lo salta.
        La manera de evitarlo es: cada vez que yo escribo nextint, si sé que luego voy a poner nextline(), escribo un nextline
        adicional, sin más, de esta manera limpiamos el sc.
         */
        sc.nextLine(); // esto es para evitar qu salte
        System.out.println("Vaya, pareces muy joven para tener " +  edad +  "años");
        System.out.println("¿Tienes mascota?");
        String mascota = sc.nextLine( );
        System.out.println("Pues muy bien.");
        //vamos a meter un dato con decimales
        System.out.println("¿Y cuál es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("¡" + patrimonio + "!");
        // con los decimales:
        // cuando los ecribimos en el código fuente se pone punto (.)
        // cuando metemos los datos por teclado se pone coma (,)

    }
}
