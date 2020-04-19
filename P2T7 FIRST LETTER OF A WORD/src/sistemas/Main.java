package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
      DATE: 16/04/2020
      DESCRIPTION: the sofware return the first letter of a word and others funcion
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_firts_letter();
        } else if (option == 2) {
            f_upper_word();
        }else{
            f_replace_vowels();
        }
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softconverword             |");
        System.out.println("|     version 1.0 15/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

    }

    public static int f_option() {
        //description this methot return the option
        System.out.println("input the option or the convertes :\n1.firstletter \n2.capitallertter  \n3.replace vowels to @");
        Scanner teclado = new Scanner(System.in);
        int option = teclado.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERROR : THIS OPTION DOES NOT EXIST");
            System.out.println("input the option or the convertes :\n1.firstletter \n2.capitallertter  \n3.replace vowels to @");
            option = teclado.nextInt();
        }
        return option;
    }

    public static void f_firts_letter() {
        //desciption:this methot return the firts letter of a word
        System.out.println("input the word");
        Scanner teclado = new Scanner(System.in);
        String word = teclado.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR : THIS WORD SHOULD HAVE A MINUMUN OF FIVE LETTERS");
            System.out.println("input again the word");
            word = teclado.nextLine();
        }
        char[] letters = word.toCharArray();
        System.out.println("the firsts letters is " + letters[0]);
    }

    public static void f_upper_word() {
        //description this method turn lowercase to uppercaser
        System.out.println("input the word");
        Scanner teclado = new Scanner(System.in);
        String word = teclado.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR : THIS WORD SHOULD HAVE A MINUMUN OF FIVE LETTERS");
            System.out.println("input again the word");
            word = teclado.nextLine();

        }
        System.out.println("the uppercase is " + word.toLowerCase());
    }

    public static void f_replace_vowels() {
        //description: this method turn replace vowels to @
        System.out.println("input the word");
        Scanner teclado = new Scanner(System.in);
        String word = teclado.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR : THIS WORD SHOULD HAVE A MINUMUN OF FIVE LETTERS");
            System.out.println("input again the word");
            word = teclado.nextLine();
        }
        String WORD2 = word.toLowerCase();
        System.out.println("the uppercase is "+WORD2.replace("a","@").replace("e","@").replace("i","@").replace("o","@").replace("u","@"));
    }
}

