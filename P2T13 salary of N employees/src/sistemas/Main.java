package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
     DATE: 21/04/2020
     DESCRIPTION:Calculates the average salary, total salary and highest salary of N
                 employees, where salary
	 */
        f_menu();
        int n= f_number_employers();
        double highestsalary=0, totalsalary=0, averagesalary=0, salary_emproyect;
        for (int i = 1; i <= n; i = i + 1){
            salary_emproyect=f_salary(i);
            totalsalary=totalsalary+salary_emproyect;
            if (highestsalary<salary_emproyect){
                highestsalary=salary_emproyect;
            }
        }
        averagesalary = totalsalary/n;
        System.out.println("the total salary is:"+totalsalary+"the average salary is: "+averagesalary+"the highest salary is:"+highestsalary);


    }
    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|           softsalary             |");
        System.out.println("|     version 1.0 21/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static int f_number_employers(){
        //description this method return the munbers of employers
        Scanner teclado= new Scanner(System.in);
        int employers;
    do {
        System.out.println("input the total employers (input more thad 1 employer)");
        employers = teclado.nextInt();
    }while (employers<1);
    return employers;
    }
    public static double f_salary (int i) {
        //description  this return the salary of one empleayend
        Scanner teclado = new Scanner(System.in);
        double sueldo, dias_tr, salary;
        do {
            System.out.println(" input the wages(the value must be more than 0):");
            sueldo=teclado.nextDouble();

        }while (sueldo<1);
        do{
            System.out.println("input the days worked (the value must )");
            dias_tr= teclado.nextDouble();
        }while (dias_tr<1||dias_tr>30);
        salary=sueldo/30*dias_tr;
        return salary;
    }

}