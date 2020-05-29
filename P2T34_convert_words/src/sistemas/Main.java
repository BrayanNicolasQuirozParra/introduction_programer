package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
	  DATE 14/05/2020
	  DESCRIPTION: With the previous information, replace all the vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157),
	   u = ⌂ (alt +127) nvert all words to uppercase.
	 */
        f_menu_();
        String[][] matrix_names = {{"maria", "pedro", "JOSE", "camilo", "rodrigo"},
                {"Ana", "lucia", "martha", "juliana", "patricia"},
                {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};

        matrix_names = f_replace_vowels(matrix_names);
        System.out.println("-------show matrix------");
        for (int i = 0; i < matrix_names.length; i++) { //recorrer las filas
            System.out.print("\n ("+(i+1)+")=");
            for (int t = 0; t < matrix_names[0].length; t++) { //columnas
                System.out.print(" | " +matrix_names[i][t] + " ");


            }

        }

    }

    public static void f_menu_() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|        softConvertsWord          |");
        System.out.println("|     version 1.0 14/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");

        System.out.println("this program creates a 4x5 matrix with the people names");

    }

    public static String[][] f_replace_vowels(String[][] matrix_names) {
        //description this method replace a vocales with = a = @, e = 3, i = 1, o = Ø (alt + 157),
        //	   u = ⌂ (alt +127) nvert all words to uppercase.
        for (int i = 0; i < matrix_names.length; i++) {
            for (int w = 0; w < 5; w++) {
                matrix_names[i][w] = matrix_names[i][w].toUpperCase().replace("A", "@").replace("E", "3").replace("I", "1")
                        .replace("O", "Ø").replace("U", "⌂");
            }
        }
        return matrix_names;
    }

}