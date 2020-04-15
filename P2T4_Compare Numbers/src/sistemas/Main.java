package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
	   DATE: 14/04/2020
	   DESCRIPTION: that asks for two numbers and says if they
       are the same or not. The process must be carried out in a
       method called compareNumbers(),
	 */
        f_menu();

        boolean rpta = f_comparaty();

        if (rpta == true) {
            System.out.println("==============================");
            System.out.println(" the two numbers ara the same ");
            System.out.println("==============================");
        } else {
            System.out.println("================================");
            System.out.println("the two numbers aren't the some ");
            System.out.println("================================");
        }
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softaverageheight          |");
        System.out.println("|     version 1.0 14/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static boolean f_comparaty() {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2;
        boolean rpta;
        System.out.println("that asks for two numbers and says if they are the same or not");
        System.out.println("ingrese el primer numero ");
        n1 = keyboard.nextInt();

        System.out.println("ingrese el sugundo numero ");
        n2 = keyboard.nextInt();


        if (n1 == n2) {
            rpta = true;
        } else {
            rpta = false;
        }
        return rpta;
    }
}
