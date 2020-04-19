package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
      DATE: 14/04/2020
      DESCRIPTION:Write two functions that allow you to calculate:
                  o The number of seconds in a given time in hours
                  o The number of seconds in a given time in minute
                  o The number of hours, minutes and seconds of a given time in seconds.


	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_convert_hours_to_second();
        } else {
            if (option == 2) {
                f_convert_minutes_to_second();
            } else {
                f_convert_seconds_to_hours_and_minutes();
            }
        }
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softconvertime             |");
        System.out.println("|     version 1.0 14/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

    }

    public static int f_option() {
        //description :
        System.out.println("input the option or the convertes :\n1.hours to seconds \n2.minute to seconds  \n3.secons to hours and minute");
        Scanner teclado = new Scanner(System.in);
        int option = teclado.nextInt();
        while (option < 1 || option > 3) {//if option is less to 1 or gerter than 3
            System.err.println("ERROR: this option not existen ");
            System.out.println("input the option or the convertes :\n1.hours to seconds \n2.minute to seconds  \n3.secons to hours and minute ");
            option = teclado.nextInt();
        }
        return option;
    }

    public static void f_convert_hours_to_second() {
        //desprintion:conver the number of seconds in a given time in hours
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the numbers hours to converts");
        int hours = teclado.nextInt();
        int seconds = hours * 60 * 60;
        System.out.println("the numbers hours:" + hours + " have " + seconds + "seconds");
    }

    public static void f_convert_minutes_to_second() {
        //desprintion:conver the number of seconds in a given time in minitues
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the numbers minutes to converts");
        int minutos = teclado.nextInt();
        int seconds = minutos * 60;
        System.out.println("the numbers hours:" + minutos + " have " + seconds + "seconds");

    }

    public static void f_convert_seconds_to_hours_and_minutes() {
        //desprintion:conver  seconds to hours an minutes
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the numbers seconds to converts");
        int seconds = teclado.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        System.out.println("the numbers hours:" + hours + " have " +minutes + "seconds");


    }
}