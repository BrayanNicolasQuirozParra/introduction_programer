package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
     DATE: 22/04/2020
     DESCRIPTION:
	 */
        f_menu();
        Scanner teclado = new Scanner(System.in);
        int totla_number = 0;
        double sumatory = 0, average = 0, number;
        System.out.println("input a number:");
        number = teclado.nextDouble();
        while (number > 100) {
            sumatory = sumatory + number;
            totla_number += 1;
            System.out.println("input other number:");
            number = teclado.nextDouble();
        }
        if (totla_number!=0){
            average=sumatory/totla_number;
        }
        System.out.println("the sumatory of "+totla_number+" is= "+sumatory+"and the average"+average);
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|           softless100            |");
        System.out.println("|     version 1.0 22/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

}