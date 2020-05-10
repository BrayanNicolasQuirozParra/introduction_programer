package sistemas;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	/*/*AUTHOR: brayan nicolas quiroz parra
        DATE: 23/04/2020
        DESCRIPTION:

	 */
        int total_person = f_menu_total_person();
        String[] vector_name = f_fill_vector(total_person);
        f_show_letter_a(vector_name);
        f_show_letter_e(vector_name);

    }

    public static int f_menu_total_person() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softagevector            |");
        System.out.println("|     version 1.0 06/05/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

        System.out.println("input the total person do you need");
        Scanner teclado = new Scanner(System.in);
        int total_person = teclado.nextInt();
        while (total_person < 0) {
            System.err.println("ERROr: THE TOTAL OF PERSON WILL BE GREATER THAN ZERO");
            System.out.println("place input again the total person do you need");
            total_person = teclado.nextInt();
        }
        return total_person;
    }

    public static String[] f_fill_vector(int total_person) {
        //description: this method return a fill vector
        String[] vector_names = new String[total_person];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < total_person; i++) {
            System.out.println("input the name bye person" + (i + 1));
            vector_names[i] = teclado.nextLine();
        }
        return vector_names;
    }

    public static void f_show_letter_a(String[] vector_name) {
        //description this method counts the names that have the letter a
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i++) {
            if (vector_name[i].indexOf("a") > 0) {
                total_words++;
            }
        }
        System.out.println("the total letter a are: " + total_words);
    }

    public static void f_show_letter_e(String[] vector_names) {
        //description this method counts the names that have the letter a
        int total_words = 0;
        for (int i = 0; i < vector_names.length; i++) {
            if (vector_names[i].indexOf("e") > 0) {
                total_words++;
            }
        }
        System.out.println("the total letter e are: " + total_words);
    }
}