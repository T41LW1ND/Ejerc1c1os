package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /* 8. Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
        “no” (en vez de true/false).*/
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Eres culpable? (S/N)");
        String culpable = sc.nextLine(); //next solamente coge el primer conjunto de caracteres hasta un espacio

        if (culpable.equals("S")) { // usar == solo lo compara, con String se utiliza el método equals; queremos decir, si la variable culpable es igual a "S"
            System.out.println("¡A la cárcel!");
        } else if (culpable.equals("N")){
            System.out.println("¡A casa!");
        } else {
            System.out.println("No me tomes el pelo.");
        }







    }
}
