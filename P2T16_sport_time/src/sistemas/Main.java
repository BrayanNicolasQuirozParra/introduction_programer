package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
        DATE: 23/04/2020
        DESCRIPTION:

	 */
        int total_lasps = 0;
        double sumamtoru_time = 0, best_lap = 0, average, time_lap;
        f_menu();
        while (f_continuar() == true) {
            total_lasps += 1;
            time_lap = f_volue_lap(total_lasps);
            sumamtoru_time += time_lap;
            if (total_lasps == 1) {
                best_lap = time_lap;
            }
            if (time_lap < best_lap) {
                best_lap = time_lap;
            }
        }
        average = sumamtoru_time / total_lasps;
        System.out.println("the best lap :" + best_lap + "total laps:" + total_lasps + "average time" + average);
    }

    public static void f_menu() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softsporttime            |");
        System.out.println("|     version 1.0 23/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }

    public static boolean f_continuar() {
        //description: this method returns a boolean value true/false
        Scanner teclado = new Scanner(System.in);
        System.out.println("Do you wnat to continue the traing (true/false)");
        boolean rta = teclado.nextBoolean();
        return rta;
    }

    public static double f_volue_lap(int lap) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Input the time (" + lap + ")lap(seconds)");
        double time = teclado.nextDouble();
        while (time < 1) {
            System.err.println("ERROR THE TIME MUST GREATER TO BE ONE");
            System.out.println("Input again the time (" + lap + ")lap(seconds)");
            time = teclado.nextDouble();
        }
        return time;
    }
}