package sistemas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*AUTHOR: brayan nicolas quiroz parra
         DATE: 27/04/2020
         DESCRIPTION:Se va a realizar la rifa de una hamburguesa en el Olimpo. Se requiere un programa que
                     genere un número aleatorio de 1 a 100.

         */
        f_menu();
        int randonnumber = f_rando_number();
        int numberuser = f_input();
        int attemps = 5;


        while (numberuser != randonnumber && attemps > 0) {
            attemps=attemps-1;
            System.err.println("Sorry but today your luck faill");
            System.out.println("Try again attemps"+attemps);
            numberuser = f_input();

        }
        if (attemps > 1) {
            System.out.println("congratulations;you win a alimpo hamburger" + randonnumber);
        } else {
            System.out.println("sorry you lost the randon number was" + randonnumber);
        }
    }


    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softradomburger          |");
        System.out.println("|     version 1.0 27/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static int f_rando_number() {
        //DESCRIPTION ESTA FUNCION CREA EL NUMERO ALEATORIO
        int number = (int) Math.floor(Math.random() * 100 + 1);

        if (number < 50) {
            System.out.println(" hint the number is ninor than se ");
        } else {
            System.out.println("hint is the number is greater than se ");
        }
        if (number % 2 == 0) {
            System.out.println("hint 2:the number is pair ");
        } else {
            System.out.println("hint 2 : the number is old ");
        }
        return number;
    }

    public static int f_input() {
        // description: esta funcion pide el numero al usuario
        Scanner teclado = new Scanner(System.in);
        int input= teclado.nextInt();

        System.out.println("type the number to compare (0-100)");
        while (input < 0 || input > 100) {
            System.err.println("ERROR THE INPUT MUST BE BETUWEIN 0 AND 100 n retry");
            input = teclado.nextInt();
        }
        return input;
    }
}