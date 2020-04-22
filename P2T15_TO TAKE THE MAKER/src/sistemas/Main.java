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
        int sumatory =0, cost_produnto, total_producto=0;
        do{
            total_producto+=1;
            System.out.println("input the cost the product("+total_producto+"):");
            cost_produnto =teclado.nextInt();
            sumatory+=cost_produnto;
            System.out.println("the teporally billis "+sumatory);
        }while (sumatory<=500000);
        sumatory=cost_produnto;
        total_producto-=1;
        System.out.println("total bill:"+sumatory+"total product"+total_producto);


    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|           softmakemarhet         |");
        System.out.println("|     version 1.0 22/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

}
