package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
      DATE: 28/04/2020
      DESCRIPTION:Build a JAVA program that counts the number of digits of
                  a number entered by keyboard.
	 */
        f_menu();
        int total_digits = 0;
        int number = f_number_user();
        if (number != 0) {
            while (number != 0) {
                number = number / 10;
                total_digits++;
            }

        } else {
            total_digits = 1;
        }
        System.out.println("the total digits of the number is " + total_digits);
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softCountdigits          |");
        System.out.println("|     version 1.0 28/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static int f_number_user() {
        //description: this program return the number input by the  use
        Scanner teclado = new Scanner(System.in);
        System.out.println("Input the any number");
        int number = teclado.nextInt();
        return number;
    }
}