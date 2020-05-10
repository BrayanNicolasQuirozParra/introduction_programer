package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
        DATE: 23/04/2020
        DESCRIPTION:

	 */
      int total_numbers=f_menu_total_numbeer();
      int[] vector_numbers=f_fill_vector(total_numbers);
      f_show_even_numbers(vector_numbers);
      f_show_odd_numbers(vector_numbers);
    }

    public static int f_menu_total_numbeer() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softoddeven              |");
        System.out.println("|     version 1.0 06/05/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

        Scanner teclado = new Scanner(System.in);
        int total_numbers;
        do {System.out.println("input the total numbers by greater than zero");
            total_numbers = teclado.nextInt();
        }while (total_numbers<=0);
        return total_numbers;
    }
    public static int[] f_fill_vector(int total_numbers){
        //description: this method return a vector with numbers
        int[] vector_numbers=new int[total_numbers];
        for (int i=0;i<total_numbers;i++){
            vector_numbers[i]=(int)Math.floor(Math.random()*(1000-100+1)+100);
        }
        return vector_numbers;
    }
    public static void f_show_even_numbers(int[]vector_numbers){
        //description this method show the eve numbers
        int total_evens=0;
        for (int number:vector_numbers){
            if ((number %2)==0){
                total_evens++;
                System.out.println("even number = "+number);
            }

        }
        System.out.println("the total even numbers is "+total_evens);

    }
    public static void f_show_odd_numbers(int[]vector_numbers){
        //description this method show the eve numbers
        int total_odd=0;
        for (int number:vector_numbers){
            if ((number %2)!=0){
                total_odd++;
                System.out.println("odd number = "+number);
            }
        }
        System.out.println("the total odd numbers is "+total_odd);

    }
}
