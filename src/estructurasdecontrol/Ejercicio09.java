package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /* 9. Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
comparan con dos valores guardados previamente. Si coinciden, se indica “Has
entrado al sistema”, en caso contrario se da un error.*/

        // se supone que en algún sitio está guardada la información, por ende se realiza una variable antes en el sistema

        String user = "Pablito";
        String passw = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String password = sc.nextLine();

        if (usuario.equals(user) && password.equals(passw)) {
            System.out.println("Has entrado en el sistema.");
        } else  {
            System.out.println("Ha habido un error. Usuario o contraseña incorrectos.");
        }




    }
}
