package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: brayan nicolas quiroz parra
      DATE: 23/04/2020
      DESCRIPTION:Crear un software en JAVA similar al de la maquina expendedora de bebidas calientes (como la que esta ubicada en la USTA)

	 */
        f_menu();
        int products = f_opcion_products();
        int product_cost = f_data_product(products, 1);
        int product_time = f_data_product(products, 2);
        int money_user = f_input_money();
        while (money_user < product_cost) {
            System.err.println("Do you need input $ " + (product_cost - money_user) + " money");
            money_user += f_input_money();
        }
        int surplus = money_user - product_cost;
        System.out.println("your surplys money is " + surplus + " the product time finish is " + product_time + " secons");
    }

    public static void f_menu() {
        System.out.println("╔══════════════════════════╦══════════════════════╦══════════════════════╗");
        System.out.println("║        Producto          ║         Valor        ║    Tiempo(creacion)  ║");
        System.out.println("╠══════════════════════════╬══════════════════════╬══════════════════════╣");
        System.out.println("║      1.Aromatica         ║         $1.300       ║      30 Segundos     ║");
        System.out.println("╠══════════════════════════╬══════════════════════╬══════════════════════╣");
        System.out.println("║      2.Cafe Negro        ║         $1.000       ║      30 Segundos     ║");
        System.out.println("╠══════════════════════════╬══════════════════════╬══════════════════════╣");
        System.out.println("║     3.Cafe con leche     ║         $1.900       ║      45 Segundos     ║");
        System.out.println("╠══════════════════════════╬══════════════════════╬══════════════════════╣");
        System.out.println("║      4.Capuchino         ║         $2.500       ║      60 Segundos     ║");
        System.out.println("╠══════════════════════════╬══════════════════════╬══════════════════════╣");
        System.out.println("║      5.Mocachino         ║         $2.700       ║      70 Segundos     ║");
        System.out.println("╚══════════════════════════╩══════════════════════╩══════════════════════╝");
    }

    public static int f_opcion_products() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the option:");
        int producto = teclado.nextInt();
        while (producto < 1 || producto > 5) {
            System.err.println("ERROR:OPTION NO EXISTS");
            System.out.println("Input again the option:");
            producto = teclado.nextInt();
        }
        return producto;
    }

    public static int f_input_money() {
        //description:this method return the input money of user
        Scanner teclado = new Scanner(System.in);
        System.out.println("input your money:");
        int money = teclado.nextInt();
        while (money < 50 || money > 5000) {
            System.err.println("ERROR:your money cannot be processed (between $50 and $5000)");
            System.out.println("Input again your money $:");
            money = teclado.nextInt();
        }
        return money;
    }

    public static int f_data_product(int product, int option) {
        //descripton this methods return two choice (money ot time )
        int data_product;
        if (product == 1) { // aromatica
            if (option == 1) { //money
                data_product = 1300;
            } else { // time
                data_product = 30;
            }
        } else if (product == 2) { // cafe negro
            if (option == 1) { //money
                data_product = 1000;
            } else { // time
                data_product = 30;
            }
        } else if (product == 3) { // cafe con leche
            if (option == 1) { //money
                data_product = 1900;
            } else { // time
                data_product = 45;
            }
        } else if (product == 4) { // capuchino
            if (option == 1) { //money
                data_product = 2500;
            } else { // time
                data_product = 60;
            }
        } else { // mocachino
            if (option == 1) { //money
                data_product = 2700;
            } else { // time
                data_product = 70;
            }
        }
        return data_product;
    }

}