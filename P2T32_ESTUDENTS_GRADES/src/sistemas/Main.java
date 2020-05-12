package sistemas;

import jdk.nashorn.internal.parser.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
	  DATE 12/05/2020
	  DESCRIPTION
	 */
        f_menu();
        double[][] matrix_grades=f_fill_matrix();
        f_fill_matrix();
        f_show_final_grades(matrix_grades);

    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|       softestudentsgrade         |");
        System.out.println("|     version 1.0 12/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");
    }
    public static double[][] f_fill_matrix(){
        //DESCRIPTION THIS METHOD RETURNS THE FILL MATRIX (10*4)
        double[][] matrix = new double[10][4];
        for (int i=0;i<10;i++){
            matrix[i][0]= Math.floor((Math.random()*5)+1); // FIRST RANDON 0.0 Y 5.0
            matrix[i][1]= Math.floor((Math.random()*5)+1); // SECONDS RANDON 0.0 Y 5.0
            matrix[i][2]= Math.floor((Math.random()*5)+1); // THIRD RANDON 0.0 Y 5.0
            matrix[i][3]= Math.floor((Math.random()*5)+1); // FOURTH RANDON 0.0 Y 5.0

        }
        return  matrix;
    }
    public static void f_show_final_grades(double[][] matrix_grsdes){
        //description: this methods show the final grades
        double final_grades=0;
        for (int i=0;i<10;i++){
            final_grades=matrix_grsdes[i][0]*0.2+
                    matrix_grsdes[i][1]*0.25+
                    matrix_grsdes[i][2]*0.25+
                    matrix_grsdes[i][3]*0.3;

            System.out.println("student ("+(i+1)+"), grade 1: "+matrix_grsdes[i][0]+" grades 2: "+matrix_grsdes[i][0]+"grade 3: "+matrix_grsdes[i][2]+
                    "grade 4: "+matrix_grsdes[i][3]+"final grade "+final_grades);


        }


    }
}

