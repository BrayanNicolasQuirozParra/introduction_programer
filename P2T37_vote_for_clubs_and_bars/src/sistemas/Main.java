package sistemas;

public class Main {
    public static int[][] matrix_votes = new int[10][2];
    public static int winner; // columna 0 colomna 1
    public static int loser;

    public static void main(String[] args) {
	/*AUTHOR BRAYAN NICOLAS QUIROZ PARRA
        DATE 19/05/2020
        DESCRIPTION:Then the software must visualize which was the result of the vote: showing the winner and the loser
        with their percentage.

	 */
        f_menu_total_rows();
        f_fill_matrix();
        f_show_winner();
        f_show_row_winner();
        f_show_less_winner();
        f_show_all_votes();



    }

    public static void f_menu_total_rows() {
        //description this method show the menu of this software
        System.out.println("====================================");
        System.out.println("|       softVotesCludAndBars       |");
        System.out.println("|     version 1.0 12/05/2020       |");
        System.out.println("|    created by: Nicolas Quiroz    |");
        System.out.println("====================================");

    }

    public static void f_fill_matrix() {
        //description
        for (int i = 0; i < matrix_votes.length; i++) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 5000) - 1);
            matrix_votes[i][1] = (int) Math.floor((Math.random() * 5000) - 1);

        }
    }
    public static void f_show_winner() {
        //description
        int total_yes = 0, total_not = 0;
        for (int i = 0; i < matrix_votes.length; i++) {
            total_not += matrix_votes[i][0];
            total_yes += matrix_votes[i][1];

        }
        if (total_not == total_yes) {
            System.out.println("yes and not are some " + total_not);
            winner = -1;
        } else if (total_not > total_yes) {
            System.out.println("the winner is the not " + total_not + " and the loser is yes " + total_yes);
            double percentnot = total_not / 5000;
            double percentyes = (total_yes / 5000);
            System.out.println("the percentage is not " + percentnot + "the percentage is yes " + percentyes);
            winner = 0;
            loser = 1;
        } else {
            System.out.println("the winner is the yes " + total_yes + "   and the loser is not " + total_not);
            double percentnot = total_not * 100 / (total_not + total_yes);
            double percentyes = (total_yes / 5000);
            System.out.println("the percentage is yes  " + percentyes + " the percentage is not " + percentnot);
            winner = 1;
            loser = 0;
        }
    }
    public static void f_show_row_winner() {
        //description
        int more_votes_winner = matrix_votes[0][winner], more_votes_winner_row = 0;
        int more_votes_loser = 0, more_votes_loser_row = 0;
        if (winner == 1) {
            more_votes_loser = matrix_votes[0][0];
        } else {
            more_votes_loser = matrix_votes[0][1];
        }
        for (int i = 0; i < matrix_votes.length; i++) {

            if (more_votes_winner < matrix_votes[i][winner]) {
                more_votes_winner = matrix_votes[i][winner];
                more_votes_winner_row = i;

                if (winner == 1) {
                    if (more_votes_winner < matrix_votes[i][winner]) {
                        more_votes_winner = matrix_votes[i][winner];
                        more_votes_loser_row = i;
                    }
                } else {
                    if (more_votes_loser < matrix_votes[i][1]) {
                        more_votes_loser = matrix_votes[i][1];
                        more_votes_loser_row = i;
                    }
                }


            }

        }
        System.out.println(more_votes_winner_row+" "+more_votes_winner+" ");
        System.out.println(more_votes_loser_row+" "+more_votes_loser+" ");

    }
    public static void f_show_all_votes(){
        //description
        System.out.println(" NO | YES ");
        for (int i=0; i<matrix_votes.length;i++){
            System.out.println(matrix_votes[i][0]+" | "+matrix_votes[i][1]);
        }
    }

    public static void f_show_less_winner() {
        //description
        int less_votes_winner = matrix_votes[0][winner], less_votes_winner_row = 0;
        int less_votes_loser = 0, less_votes_loser_row = 0;
        if (winner == 1) {
            less_votes_loser = matrix_votes[0][0];
        } else {
            less_votes_loser = matrix_votes[0][1];
        }
        for (int i = 0; i < matrix_votes.length; i++) {

            if (less_votes_winner < matrix_votes[i][winner]) {
                less_votes_winner = matrix_votes[i][winner];
                less_votes_winner_row = i;

                if (winner == 1) {
                    if (less_votes_winner > matrix_votes[i][winner]) {
                        less_votes_winner = matrix_votes[i][winner];
                        less_votes_loser_row = i;
                    }
                } else {
                    if (less_votes_loser > matrix_votes[i][1]) {
                        less_votes_loser = matrix_votes[i][1];
                        less_votes_loser_row = i;
                    }
                }


            }

        }
        System.out.println(less_votes_winner_row+" "+less_votes_winner+" ");
        System.out.println(less_votes_loser_row+" "+less_votes_loser+" ");

    }
}
