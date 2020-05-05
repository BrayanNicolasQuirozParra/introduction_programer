package sistemas;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
      DATE: 23/04/2020
      DESCRIPTION

	 */
        f_menu();
        int[] salary_of_employees = f_sueldos();
            f_show_sueldos(salary_of_employees);
        }

    

    public static void f_menu() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║    SoftVectorsalary           ║ ");
        System.out.println("║   Maker:Nicolas quiroz        ║");
        System.out.println("║ Date 04/05/2020 version 1.0   ║");
        System.out.println("╚══════════════════════════════╩");
    }

    public static int[] f_sueldos() {
        //description:
        Random rand = new Random();
        int[] salary = new int[5]; //this var to save the salary
        for (int i=0;i<5;i++) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 1000000 + 1) + 1000000);
        }
        return salary;
    }

    public static void f_show_sueldos(int[] salary) {
        //description
        System.out.println("------The list of salary is:------");
        for (int i = 0; i < 5; i++) {
            System.out.println("the salay of(" + (i + 1) + ")is" + salary[i]);
        }
    }
}