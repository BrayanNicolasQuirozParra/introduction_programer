package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
      DATE: 23/04/2020
      DESCRIPTION:Read 5 numbers and show them in reverse order to the one entered.

	 */
      f_menu();
      f_number_user();
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|          softreverseorden        |");
        System.out.println("|     version 1.0 27/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static void f_number_user(){
        //description
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        double pro;
        System.out.println("input the number 1");
        num1=teclado.nextInt();
        System.out.println("input the number 2");
        num2=teclado.nextInt();
        System.out.println("input the number 3");
        num3=teclado.nextInt();
        System.out.println("input the number 4");
        num4=teclado.nextInt();
        System.out.println("input the number 5");
        num5=teclado.nextInt();
        System.out.println("the inverted numbers are: "+num5+","+num4+","+num3+","+num2+","+num1);
        pro= (num1+num2+num3+num4+num5)/5;
        System.out.println("the average of the number is: "+pro);
    }
}