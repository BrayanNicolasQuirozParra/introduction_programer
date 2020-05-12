package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
	  DATE 12/05/2020
	  DESCRIPTION

	 */
     int total_competitors =f_menu_total_competitors();
     double[][] matrix_competition=f_fill_matrix_competition(total_competitors);
     String texto=" ";
        System.out.println("---------the times of competition---------");
        System.out.println("player | T1 | T2 | T3 | T4  |T5 | T6 | T7 | T8 | T9 | T10");
     for (int i=0;i<total_competitors;i++){ //recorrer filas
         texto+="\n"+(i+1);
         for (int j=0;j<10;j++){  //recorer las colomnas
             texto+= " | "+matrix_competition[i][j]+" ";

         }
     }
        System.out.println(texto);
    }

    public static int f_menu_total_competitors () {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|     softSwimmingCompetition      |");
        System.out.println("|     version 1.0 12/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");

        System.out.println("input who many competitors do you want ");
        Scanner teclado =new Scanner(System.in);
        int total_competitors= teclado.nextInt();
        while (total_competitors<=0){
            System.err.println("ERROR THE VALUE MUST GRADES THAN ZARO ");
            System.out.println("input again who many competitors do you want ");
            total_competitors= teclado.nextInt();
        }
        return total_competitors;
    }
    public static double[][] f_fill_matrix_competition (int total_competitors){
        //description this method returns a fill matrix of time the competition
        double[][] matrix_competition =new double[total_competitors][10];
        for (int i=0;i<total_competitors;i++){ //para recorrer las filas  competidores
            for (int j=0;j<10;j++){ //para recorrer las columnas tiempo
                matrix_competition[i][j]=Math.floor((Math.random()*(10-6)+6)); //RENDOMICOS ENTRRE 6.0 Y 10.0
            }
        }
        return matrix_competition;
    }

}
