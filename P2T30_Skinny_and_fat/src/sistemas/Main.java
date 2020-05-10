package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*AUTHOR: Brayan nicolas quiroz parra
          DATE: 22/04/2020
          DESCRIPTION:

         */
        int total_people = f_menu();
        double[] vector_weights = f_fill_vector_weights(total_people);
        f_show_malnourished(vector_weights);
        f_show_skeinny(vector_weights);
        f_show_fat(vector_weights);
        f_show_all_weights(vector_weights);
    }

    public static int f_menu() {
        System.out.println("====================================");
        System.out.println("|        softSkinnyAndFat          |");
        System.out.println("|     version 1.0 07/05/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");

        System.out.println("input the number of men");
        Scanner teclado = new Scanner(System.in);
        int person_n = teclado.nextInt();
        while (person_n <= 0) ;
        System.err.println("ERROR MUST BE GREATER THAN ZERO");
        System.out.println("input the again number of men");
        teclado = new Scanner(System.in);
        return person_n;
    }

    public static double[] f_fill_vector_weights(int total_people) {
        //description  this method return the vector weigh
        double[] vector_wights = new double[total_people];
        for (int i = 0; i < total_people; i++) {
            vector_wights[i] = (Math.random() * (120 - 21) + 20);
        }
        return vector_wights;
    }

    public static void f_show_malnourished(double[] vector_weights) {
        //description this method show the total people are malnourished
        int total_malnourished = 0;
        for (double weights : vector_weights) {
            if (weights < 40) {
                total_malnourished++;

            }
        }
        System.out.println("the total people of malnourished people is  " + total_malnourished);
    }

    public static void f_show_skeinny(double[] vector_weights) {
        //description this method show the total people are malnourished
        int total_skeinny = 0;
        for (double weights : vector_weights) {
            if (weights >= 40 && weights < 70) {
                total_skeinny++;

            }
        }
        System.out.println("the total people skeinny is  " + total_skeinny);
    }

    public static void f_show_fat(double[] vector_weights) {
        //description this method show the total people are malnourished
        int total_fat = 0;
        for (double weights : vector_weights) {
            if (weights >= 70) {
                total_fat++;

            }
        }
        System.out.println("the total people fat is  " + total_fat);
    }

    public static void f_show_all_weights(double[] vector_weights) {
        //description
        for (int i = 0; i < vector_weights.length; i++) {
            System.out.println("the weights of the person (" + (+i + 1) + ") is " + vector_weights[i]);
        }
    }
}