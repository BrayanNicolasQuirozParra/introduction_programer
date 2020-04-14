package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
	   DATE: 14/04/2020
	   DESCRIPTION:Create a program that asks for two numbers and says if
one is a multiple of the other.
	 */
        f_menu();
        f_inpur_numbers();
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softaverageheight          |");
        System.out.println("|     version 1.0 14/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static boolean f_multiplo(int n1, int n2){
        //description: esta funcion deternima si es multiplo o no
    boolean multiplo= false;
    if (n1*n2==0) {
        multiplo = true;
    }
    return multiplo;

    }
    public static void f_inpur_numbers(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("ingrese el primer numero entero ");
        int n1= keyboard.nextInt();
        System.out.println("ingres el segundo numero entero ");
        int n2 = keyboard.nextInt();
        boolean rpta= f_multiplo(n1,n2);
        if (rpta==true){
            System.out.println(n1+" es multiplo "+n2);
        }
        else {
            System.out.println(n1+" no es numtiplo "+n2);
        }
        }
    }

