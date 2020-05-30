package sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
	  DATE 12/05/2020
	  DESCRIPTION:Fill a two-dimensional array of N x M (values that the user must enter by keyboard), with random
	  numbers between 1 and 1000.


	 */
        int rows = f_menu_total_rows();
        int colomns = f_total_columns();
        int[][] matriz_numbers = new int[rows][colomns];//the matrix is empty
        matriz_numbers = f_fill_matrix(matriz_numbers); // fill the matrix with munbers

        System.out.println("input the number of the row: ");
        int numbers_row= teclado.nextInt();
        int sumatory=0;
        double average=0;

        while (numbers_row>=0 || numbers_row<matriz_numbers.length-1){ //to walg only the colums
          for (int g=0; g<matriz_numbers[0].length;g++){
              System.out.println("\n |  "+matriz_numbers[numbers_row][g]);
              sumatory+=matriz_numbers[numbers_row][g];

          }
          average=sumatory/matriz_numbers[0].length;
            System.out.println(" by numbers row "+numbers_row+" the sum is "+sumatory+" and the average is "+average);
            System.out.println("input other number of the row");
            numbers_row= teclado.nextInt();
        }
        System.out.println("----thanks----");
    }

    public static int f_menu_total_rows() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|     softSwimmingCompetition      |");
        System.out.println("|     version 1.0 12/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");

        System.out.println("input who many rows do you want in the matrix ");
        int total_rows = teclado.nextInt();
        while (total_rows <= 0) {
            System.err.println("ERROR THE VALUE MUST GRADES THAN ZARO ");
            System.out.println("input again who many total do you want ");
            total_rows = teclado.nextInt();
        }
        return total_rows;
    }

    public static int f_total_columns() {
        //description
        System.out.println("input who many colomns do you want in the matrix ");
        int total_colomns = teclado.nextInt();
        while (total_colomns <= 0) {
            System.err.println("ERROR THE VALUE MUST GRADES THAN ZARO ");
            System.out.println("input again who many colooms do you want ");
            total_colomns = teclado.nextInt();
        }
        return total_colomns;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers) { //input the empy matrix
        //description this methods fill the matrix
        for (int i = 0; i < matrix_numbers.length; i++) { //to walk the rows
            for (int r = 0; r < matrix_numbers[0].length; r++) { // to wald the colomns
                matrix_numbers[i][r] = (int) Math.floor((Math.random() * 1000) + 1); //MATH.RAMDON() =

            }

        }
        return matrix_numbers;
    }
}