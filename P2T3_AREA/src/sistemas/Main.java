package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Brayan nicolas quiroz parra
	   DATE: 14/04/2020
	   DESCRIPTION:
	 */
        f_menu();
        Scanner teclado = new Scanner(System.in);
        int opt = teclado.nextInt();
        if (opt < 1 || opt > 3) {
            System.err.println(" erros : solo es de uno a tres");
        } else {
            if (opt == 1) {
                f_area_circule();
            } else if (opt == 2) {
                f_area_square();
            } else {
                f_triangle();
            }
        }
    }

    public static void f_menu() {
        System.out.println("====================================");
        System.out.println("|       softaverageheight          |");
        System.out.println("|     version 1.0 13/04/2020       |");
        System.out.println("|    created by: nicolas quiroz    |");
        System.out.println("====================================");
        System.out.println("esta aplicacion calcula la erea de una figura :\n1.circulo \n2.cuadrado \n3.triangulo");
    }

    public static void f_area_circule() {
        //description:
        Scanner teclado = new Scanner(System.in);
        System.out.println("area del circulo es necesario que ingrese (radio)");
        double radio = teclado.nextDouble();
        double area = (radio * radio) * 3.141517;
        System.out.println("el area del circulo es" + area);
    }

    public static void f_area_square() {
        //description
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese para el lado ");
        double lado = teclado.nextDouble();
        double area = (lado * lado);
        System.out.println("la area del cuadrado es" + area);
    }

    public static void f_triangle() {
        Scanner teclado = new Scanner(System.in);
        double area, base, altura;
        System.out.println("ingrese la base ");
        base = teclado.nextDouble();
        System.out.println("ingrese la altura ");
        altura = teclado.nextDouble();
        area = (base * altura) / 2;
        System.out.println("la area del triangulo es" + area);


    }
}