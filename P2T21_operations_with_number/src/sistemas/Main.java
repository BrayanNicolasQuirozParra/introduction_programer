package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: brayan nicolas quiroz parra
       DATE: 28/04/2020
       DESCRIPTION:
	 */
        f_menu();
        f_operation_number();
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|    softoperationswithnumber      |");
        System.out.println("|     version 1.0 28/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static void f_operation_number() {
        //description
        int sumatory_possitives = 0, sumatory_negatives = 0, total_cero = 0, number;
        int total_positive = 0, total_negative=0;
        double average_positive=0, average_negative=0;
        for (int i = 1; i <= 10; i++) {
            number = f_user_nomber(i);
            if (number < 0) {
                sumatory_negatives -= number;
                total_negative++;
            } else if (number > 0) {
                sumatory_possitives += number;
                total_positive++;
            } else {
                total_cero++;
            }
        }
        if (total_positive>0){
            average_positive=sumatory_possitives/total_positive;
        }if (total_negative>0){
            average_negative=sumatory_negatives/total_negative;
        }
        System.out.println("the positive average is "+average_positive);
        System.out.println("the negatives average is "+average_negative);
        System.out.println("the total zero numbers is "+total_cero);
    }

    public static int f_user_nomber(int i) {
        //decription:
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the number " + i);
        int number = teclado.nextInt();
        return number;
    }
}