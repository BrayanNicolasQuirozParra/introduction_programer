package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
	   DATE:13/04/2020
	   DESCRIPTION:JAVA program that calculates the
       average height of a group of 5 children.
}
	 */
        f_menu();
        double sumatory= f_sum_height();
        System.out.println("The summatory is: "+sumatory+ " mts");
        f_average(sumatory);

    }
    //esta funcion no le ingresan parametros y no me retorna nada
    public static void f_menu(){
        //Description: this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|       softaverageheight          |");
        System.out.println("|     version 1.0 13/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

    }
    //esta funcion NO le ingresan parametros y SI me retorna un double
    public static double f_sum_height(){
        //Description: this method calculate the summatory of 5 height
        Scanner keyboard = new Scanner(System.in);
        double sumatory, height1,height2,height3, height4, height5;
        System.out.println("Input de firts height (mts):");
        height1=keyboard.nextDouble();
        System.out.println("Input de second height (mts):");
        height2=keyboard.nextDouble();
        System.out.println("Input de third height (mts):");
        height3=keyboard.nextDouble();
        System.out.println("Input de fourth height (mts):");
        height4=keyboard.nextDouble();
        System.out.println("Input de fifth height (mts):");
        height5=keyboard.nextDouble();
        sumatory=height1+height2+height3+height4+height5;
        return sumatory;


    }
    //esta funcion SI le ingresan parametros y NO me retorna nada
    public static void f_average(double sumatory){
        //Description: this method calculate the average
        double average= sumatory/5;
        System.out.println("The average is: "+average+ " (mts)");
    }
}


