package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
      DATE: 16/04/2020
      DESCRIPTION: the software convierte pesos colombianos a dolares y a euros

	 */
        f_menu();
        int option = f_option();
        while (option != 0)
        if (option == 1) {
            f_pesos_to_dolar();
        } else {
            if (option == 2) {
                f_pesos_to_euros();
            } else {
                if (option == 3) {
                    f_euros_to_dolares();
                }
            }
            option= f_option();
        }
    }


    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softconvertdiner           |");
        System.out.println("|     version 1.0 15/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

    }

    public static int f_option() {
        //DESCRIPTON COMBIERTE DE PESOS A DOLARES
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the option or the convertes :\n1.P, D \n2.P, E \n3.E, D \n0.Salir");
        int option = teclado.nextInt();
        while (option < 0 || option > 3) {
            System.err.println("ERROR : THIS OPTION DOES NOT EXIST");
            System.out.println("input the option or the convertes :\n1.P D \n2.P E \n3.E D \n.Salir");
            option = teclado.nextInt();
        }
        return option;
    }

    public static void f_pesos_to_dolar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the amount of weights");
        int pesos = teclado.nextInt();
        while (pesos < 1000) {
            System.err.println("ERROR, you can't get less than 1000");
            System.out.println("input the amount of weights");
            pesos = teclado.nextInt();
        }
        double dolares = pesos * 3937;
        System.out.println("the weights entered has a dollar value" + dolares);
    }

    public static void f_pesos_to_euros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the amount of weights");
        int pesos = teclado.nextInt();
        while (pesos < 1000) {
            System.err.println("ERROR, you can't get less than 1000");
            System.out.println("input the amount of weights");
            pesos = teclado.nextInt();
        }
        double euros = pesos * 4273;
        System.out.println("the weights entered has a dollar value" + euros);
    }

    public static void f_euros_to_dolares() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the Amount of euros");
        int euros = teclado.nextInt();
        while (euros < 10) {
            System.err.println("ERROR, you can't get less than 1000");
            System.out.println("input the amount of weights");
            euros = teclado.nextInt();
        }
        double dolares = euros * 0.92;
        System.out.println("the weights entered has a dollar value" + dolares);
    }
}

