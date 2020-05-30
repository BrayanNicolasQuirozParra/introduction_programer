package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
     DATE 13/05/2020
     DESCRIPTION:Let USTA learn how students rate food in the Giordano Bruno building cafeteria. For this, a scale of 1
                     to 10 was defined (1 denotes horrible and 10 denotes excellent).
	 */
        int total_students = f_menu_total_students();
        int[][] retas_matrix = f_fiil_retes_matrix(total_students);
        f_show_bad_rates(retas_matrix);
        f_show_regular_rates(retas_matrix);
        f_show_execellent_rates(retas_matrix);
    }

    public static int f_menu_total_students() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|        softRatingTheFood         |");
        System.out.println("|     version 1.0 13/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");

        System.out.println("input who many students do you want by rate food ");
        Scanner teclado = new Scanner(System.in);
        int total_students = teclado.nextInt();
        while (total_students <= 0) {
            System.err.println("ERROR THE VALUE MUST GRADER THE ZERO  ");
            System.out.println("input again who many students do you want ");
            total_students = teclado.nextInt();
        }
        return total_students;
    }

    public static int[][] f_fiil_retes_matrix(int total_students) {
        //description  this method returns a matrix witnh rates of n students
        int[][] rates_matrix = new int[total_students][20];
        for (int i = 0; i < total_students; i++) {  //recorrer las filas
            for (int w = 0; w < 20; w++) {
                rates_matrix[i][w] = (int) Math.floor((Math.random() * 10) + 1);
            }
        }
        return rates_matrix;
    }

    public static void f_show_bad_rates(int[][] retes_matrix) {
        //description  this method show the bad rates <=3
        int total_bad_rates = 0;
        for (int e = 0; e < retes_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (retes_matrix[e][r] <= 3) {
                    total_bad_rates++;
                }
            }
        }
        double porcent = (total_bad_rates * 100) / (retes_matrix.length * 20);
        System.out.println("total bad rates (<=3): " + total_bad_rates + " , percent : % " + porcent);

    }

    public static void f_show_regular_rates(int[][] retes_matrix) {
        //description  this method show the bad rates <=3
        int total_regular = 0;
        for (int e = 0; e < retes_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (retes_matrix[e][r] >= 4 && retes_matrix[e][r] <= 6) {
                    total_regular++;
                }
            }
        }
        double porcent = (total_regular * 100) / (retes_matrix.length * 20);
        System.out.println("total regular rates (>=4 and <=6): " + total_regular + " , percent : % " + porcent);

    }

    public static void f_show_execellent_rates(int[][] retes_matrix) {
        //description  this method show the bad rates <=3
        int total_execellent = 0;
        for (int e = 0; e < retes_matrix.length; e++) {
            for (int r = 0; r < 20; r++) {
                if (retes_matrix[e][r] >= 7 ) {
                    total_execellent++;
                }
            }
        }
        double porcent = (total_execellent * 100) / (retes_matrix.length * 20);
        System.out.println("total execellent rates (grater or some than 7): " + total_execellent + " , percent : % " + porcent);
    }
}