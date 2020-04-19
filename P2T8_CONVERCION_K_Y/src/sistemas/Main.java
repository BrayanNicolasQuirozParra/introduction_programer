package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
      DATE: 16/04/2020
      DESCRIPTION: this sofware converts k,m, into k,y upsa

	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_Ki_to_Mi();
        } else {
            if (option == 2) {
                f_Ki_to_Ya();
            } else {
                if (option == 3) {
                    f_milles_to_KI();
                } else {
                    if (option == 4) ;
                    f_yars_to_Ki();
                }
            }
        }
    }


    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softconversdistance        |");
        System.out.println("|     version 1.0 15/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

    }

    public static int f_option() {
        //description this methot return the option
        System.out.println("input the option or the convertes :\n1.ki;MI \n2.Ki;Ya  \n3.Ya,Ki \n4.Ya,Ki");
        Scanner teclado = new Scanner(System.in);
        int option = teclado.nextInt();
        while (option < 1 || option > 4) {
            System.err.println("ERROR : THIS OPTION DOES NOT EXIST");
            System.out.println("input the option or the convertes :\n1.ki;MI \n2.Ki;Ya  \n3.MI,Ki \n4.Ya,Ki");
            option = teclado.nextInt();
        }
        return option;
    }

    public static void f_Ki_to_Mi() {
        //descriptiopnthis rectod converts Ki into wills
        Scanner teclado = new Scanner(System.in);
        System.out.println("input to well in kilometros (Km)");
        double kilometros = teclado.nextDouble();
        double milles = kilometros * 0.6214;
        System.out.println("the milles are:" + milles + "milles");
    }

    public static void f_Ki_to_Ya() {
        //description this method converts  KI into Ya
        Scanner teclado = new Scanner(System.in);
        System.out.println("input to well in kilometros (Km)");
        double kilometros = teclado.nextDouble();
        double year = kilometros * 1093.6;
        System.out.println("the milles are:" + year + "year");
    }

    public static void f_milles_to_KI() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input to well in MILLES (KL)");
        double milles = teclado.nextDouble();
        double kilometer = milles / 0.62137;
        System.out.println("the milles are:" + kilometer + "km");
    }

    public static void f_yars_to_Ki() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input to well in yaerds (YD)");
        double years = teclado.nextDouble();
        double kilometer = years / 1093.6;
        System.out.println("the milles are:" + kilometer + "km");
    }
}
