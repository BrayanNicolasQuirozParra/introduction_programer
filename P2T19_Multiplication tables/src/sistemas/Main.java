package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
         DATE: 27/04/2020
         DESCRIPTION:Construir un programa en JAVA que, Utilizando ciclos
                     repetitivos construya un programa que imprima las
                     tablas de multiplicar del número 1 al número 10 en el
                     rango del 1 al 10.

	 */
        f_menu();
        int number_user = f_user_number();
        f_generate_multiplication_table(number_user);


    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|    softmultiplicationtable       |");
        System.out.println("|     version 1.0 27/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static int f_user_number() {
        //description : this method ask the user what multiply table want
        Scanner teclado = new Scanner(System.in);

        System.out.println("input the multiply table that you want ");
        int user_numbe = teclado.nextInt();

        while (user_numbe < 1 || user_numbe > 99) {
            System.out.println("ERROR: you only have the multiply tables between the 1 and 99");
            System.out.println("input again the multiply table that you want ");
            user_numbe = teclado.nextInt();
        }
        return user_numbe;
    }

    public static void f_generate_multiplication_table(int user_munber){
        //description: this method with a for show the multiplication tables
        System.out.println("the multiplication table is ");
        for (int i=1; i<=10;i++){
            System.out.println(user_munber+" x "+i+"="+user_munber*i);
        }
    }
}