package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
     DATE: 21/04/2020
     DESCRIPTION:Determines the total saved per person in N months. Yes A person
                 saves X amount of money each month.

	 */
        f_menu();
        Scanner teclado = new Scanner(System.in);
        int n = f_total_months();
        int total_saved = 0, average_saved = 0;

        for (int i = 1; i < n; i = i + 1) {
            System.out.println("input the money the " + i + " month");
            total_saved = total_saved + teclado.nextInt();
            System.out.println("the total saved money is:"+total_saved+"and the average money is :"+average_saved);
        }

    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softtotalsevemoney         |");
        System.out.println("|     version 1.0 21/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static int f_total_months(){
        //description this method return the total months
        Scanner teclado= new Scanner(System.in);
        int n_months;
        do {
            System.out.println("input the total months (the value must be greater than zero): ");
            n_months= teclado.nextInt();
        }while (n_months<1);
        return n_months;

    }
}