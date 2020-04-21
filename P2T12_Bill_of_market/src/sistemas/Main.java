package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Brayan nicolas quiroz parra
     DATE: 21/04/2020
     DESCRIPTION:Calculates gross value and total value = gross value + VAT (19%)
                 for N products
	 */
        f_menu();
        int n = f_produntos();
        double total_bill = 0;
        for (int i = 1; i <= n; i = i + 1) {
        total_bill = total_bill + f_valor_product(i);
    }
        System.out.println("the total billis"+total_bill);
    }
    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softbillofmarket           |");
        System.out.println("|     version 1.0 21/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
    }
    public static int f_produntos(){
        //description: this method the number of total products
        Scanner teclado= new Scanner(System.in);
        System.out.println("Input the number of products");
        int total_products = teclado.nextInt();
        while (total_products<1){
            System.err.println("ERROR: THE TOTAL OF THE PRODUCTS MUST BE GREATER THAN ONE");
            System.out.println("Input again the number of products");
             total_products = teclado.nextInt();
        }
        return total_products;
    }
    public static double f_valor_product(int i){
        //description this method return the total of the product}
        Scanner teclado= new Scanner(System.in);
        System.out.println("Input the value of product ("+i+"):");
        double producto = teclado.nextInt();
        while (producto<=0){
            System.err.println("ERROR THE VALUE OF PRODUCT MUST BE GREATER THAN ZERO ");
            System.out.println("Input again the value of product ("+i+"):");
            producto = teclado.nextInt();
        }
        if (producto>1000){
            producto= producto*1.19;
        }
        return producto;
    }
}