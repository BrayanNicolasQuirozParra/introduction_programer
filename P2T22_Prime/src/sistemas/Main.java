package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: brayan nicolas quiroz parra
       DATE: 28/04/2020
       DESCRIPTION:

	 */
        f_menu();
        int number = f_user_number();
        int total_primes = 0;
        for (int i = 1; i <= number; i++) {
            if (f_number_prime(i)==true){
             total_primes++;
                System.out.println("number" + i + " is prime " );

            }
        }
        System.out.println("the total primes is"+total_primes);
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|           softPrime              |");
        System.out.println("|     version 1.0 28/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static int f_user_number() {
        //description:
        Scanner teclado = new Scanner(System.in);
        int number;
        System.out.println("Input a number grater than 1");
        number = teclado.nextInt();
        while (number <= 1) {
            System.err.println("ERROR:the number is not grater than 1 please rectify");
            System.out.println("Input again a number grater than 1");
            number = teclado.nextInt();
        }
        return number;
    }

    public static boolean f_number_prime(int number) {
        //description:
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count = count + 1;

            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }
    }

}

