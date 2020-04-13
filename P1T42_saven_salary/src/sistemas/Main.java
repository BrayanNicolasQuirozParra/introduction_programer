package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: BRAYAN NCIOLAS QUIROZ PARRA
	   DATE: 01/04/2020
	   DESCRIPTION: The software determines how much money a person saves in a year if
	                you consider that each week you save 15% of your salary
	 */
	    Scanner keyboar= new Scanner(System.in);
	    f_menu();//llamo la metodo/funcion llamada f_menu();
        System.out.println("input your salary");
        int salary= keyboar.nextInt();

    }
        public static void f_menu(){
            System.out.println("-_________________________-");
            System.out.println("|      softsavemoney      |");
            System.out.println("|  version 1.0 01/04/2020 |");
            System.out.println("|  maker: nicolas quiroz  |");
            System.out.println("-_________________________-");
        }
    public static void p_saved_money(int p_salary){
        //description: this method/funcion calculates the total saved moneyin a year.
        double saved_money = ((p_salary*0.15)*4)*12;
        System.out.println(" the total save money in a year is:"+saved_money);
    }


    }

