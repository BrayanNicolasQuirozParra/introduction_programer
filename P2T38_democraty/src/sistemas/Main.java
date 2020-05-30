package sistemas;

public class Main {
    public static int[][] matrix_votes = new int[123][8];  //123 rows  x colom
    public static int[] total_votes = new int[8]; //totalizar votos
    public static String[] vector_parties = {"liberal", "Conservador" , "Alianza verde" , "La U" , "cambio radical" , "Centro democrático " , "MIRA" , "Polo"};
    public static int winner_votes = 0;
    public static int winner_column = 0;

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
     DATE 21/05/2020
     DESCRIPTION:Perform the simulation of a voting process for the Boyacá governorate where there are seven (7)
     candidates from the main political parties in Colombia

	 */
        f_menu_();
        f_fill_matrix(); //fill with votes
        f_total_votes(); //calculates the total votes
        for (int i = 0; i < total_votes.length; i++) {
            System.out.println(vector_parties[i] + "total votes " + total_votes[i]);
        }
        f_show_winner();
    }

    public static void f_menu_() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|         softDedemocracy          |");
        System.out.println("|     version 1.0 21/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");
    }

    public static void f_fill_matrix() {
        //Description: this method fills the matrix with votes
        for (int i = 0; i < matrix_votes.length; i++) {  //to walt matrix from 0 to 122
            for (int h = 0; h < matrix_votes[0].length; h++) { //to walk the colonm matrix from 0 to
                matrix_votes[i][h] = (int) Math.floor((Math.random() *1000) + 1); //RAMDOM NUMBERS BETWEEN 1 1000


            }

        }


    }

    public static void f_total_votes() {
        //Description this method calculates the total votes for every parties
        for (int k = 0; k < matrix_votes[0].length; k++) { //to walk the colonm matrix from 0 to

            for (int i = 0; i < matrix_votes.length; i++) { //to walt matrix from 0 to 122
                total_votes[k] += matrix_votes[i][k];  //sum every row (i) by
            }
        }
    }

    public static void f_show_winner() {
        //description this method walks the vector total_votes
        winner_votes = total_votes[0];
        int loser_votes=total_votes[0], loser_colomn=0;
        for (int k = 0; k < total_votes.length; k++) {
            if (winner_votes < total_votes[k]) {
                winner_votes = total_votes[k];
                winner_column = k;
            }
        }
        System.out.println("------ second place ------");
        for (int k = 0; k < total_votes.length; k++) {
            if (winner_column!=k){
                if (loser_votes<total_votes[k]){
                    loser_votes=total_votes[k];
                    loser_colomn++;
                }
            }
        }
        System.out.println("the winner is: " +vector_parties[winner_column]+ " total votes " +total_votes[winner_column]);
        System.out.println("the second plase is: " +vector_parties[loser_colomn]+ " total votes " +total_votes[loser_colomn]);
    }
}

