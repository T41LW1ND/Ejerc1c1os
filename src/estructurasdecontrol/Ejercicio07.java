package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable?");
        boolean culpable = sc.nextBoolean();

        if (culpable == true) {
            System.out.println("¡A la cárcel!");
        } else {
            System.out.println("¡A casa!");
        }
    }
}
