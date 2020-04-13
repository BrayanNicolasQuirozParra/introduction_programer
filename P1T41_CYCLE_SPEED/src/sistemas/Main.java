package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
       DATE: 01/04/2020
       DESCRIPTION: The software the time it takes a person to get from one city to another by bicycle,
        considering that it has a constant speed and distance
	 */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("-________________________-");
        System.out.println("|     soft velocity      |");
        System.out.println("|      version 1.0       |");
        System.out.println("|   maker:nicolas quiroz |");
        System.out.println("-________________________-");
        double velocity;
        System.out.println("input the velocity(km/h):");
        velocity = keyboard.nextDouble();

        f_time(velocity);

    }
    public static void f_time(double velocity){
        /*DESCRIPTION: this function calculate the time t: d/t */
        System.out.println("input the distance between into two cities(km): ");
        double time, distance;
        Scanner keyboard = new Scanner(System.in);
        distance = keyboard.nextDouble();
        time = distance/velocity;
        System.out.println(" the time is:"+Math.round(time)+"hours");

    }
}