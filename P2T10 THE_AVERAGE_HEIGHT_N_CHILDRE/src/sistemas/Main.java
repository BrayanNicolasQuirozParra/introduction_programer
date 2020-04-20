package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
      DATE: 20/04/2020
      DESCRIPTION: calculates the average height of
	 */
        f_menu();
        int total_children=f_total_children();
        double sumatory=0, average;
        for (int i = 1;i<=total_children;i=i+1){
            sumatory=sumatory+f_height_child(i);
        }
        average=sumatory/total_children;
        System.out.println("the average of height is:"+average+"mts");
    }
    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softaverageheight          |");
        System.out.println("|     version 1.0 20/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static int f_total_children(){
        //description: this method return the total children
        System.out.println("input the total children to calculate the height");
        Scanner teclado= new Scanner(System.in);
        int children = teclado.nextInt();
        while (children<1){
            System.err.println("ERROR the value should be greater than zero " );
            System.out.println("input  again the total children to calculate the heigh");
            children=teclado.nextInt();
        }
        return children;
    }
    public static double f_height_child(int i){
        //description: this methot return the height of a child
        Scanner teclado= new Scanner(System.in);
        System.out.println("input the height (mts) of child ("+i+"): ");
        double height=teclado.nextDouble();
        while (height<0.20||height>2){//20cm o 2mts
            System.err.println("ERROR the values should be between 0.2 and 2 mts ");
            System.out.println("input egain the height (mts) of child ("+i+"): ");
            height= teclado.nextDouble();
        }
        return height;
    }

}