package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
        DATE: 23/04/2020
        DESCRIPTION:

	 */
        f_menu();
        int n_intentos=1;
        boolean option=f_input_passwords();
        while (n_intentos<=3&& option==false){
            n_intentos+=1;
            System.err.println("The password is wrong try again");
            option =f_input_passwords();
        }
        if (n_intentos==4){
            System.out.println("you cannot get into the plaform");
        }else {
            System.out.println("welcome to the plastfor");
        }
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softpassword             |");
        System.out.println("|     version 1.0 23/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static Boolean f_input_passwords(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Input the password");
        boolean pass= false;
        int passwords= teclado.nextInt();
        if (passwords==352||passwords==259||passwords==569){
            pass=true;
        }
        return pass;
    }
}