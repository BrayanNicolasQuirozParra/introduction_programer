package sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int total_candidates = f_menu();
        int[] vector_votes = f_fill_vectors_votes(total_candidates);
        f_show_the_winner(vector_votes);
        f_show_all_votes(vector_votes);
    }

    public static int f_menu() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║        SoftDemocrazy          ║ ");
        System.out.println("║     Maker:Nicolas quiroz      ║");
        System.out.println("║  Date 04/05/2020 version 1.0  ║");
        System.out.println("╚══════════════════════════════╩");

        System.out.println("input the total the condidates");
        Scanner teclado = new Scanner(System.in);
        int total_candidates = teclado.nextInt();
        while (total_candidates < 2) {
            System.err.println("ERROR THE TOTAL PEOPLE CANT BE LESS THAN 2");
            System.out.println("input the total the condidates");
            total_candidates = teclado.nextInt();
        }
        return total_candidates;
    }

    public static int[] f_fill_vectors_votes(int total_votes) {
        //description
        int[] vector_votes = new int[total_votes];
        for (int i = 0; i < total_votes; i++) {
            vector_votes[i] = (int) Math.floor((Math.random() * 5000) + 1);
        }
        return vector_votes;
    }

    public static void f_show_the_winner(int[] vector_votes) {
        //description
        int winner_votes = 0, winner_number = 0;
        for (int i = 0; i < vector_votes.length; i++) {
            if (i == 0) {
                winner_votes = vector_votes[i];
            } else {
                if (vector_votes[i] > winner_votes) {
                    winner_votes = vector_votes[i];
                    winner_number = i;
                }

            }
        }
        System.out.println("the winner candidate is: " + winner_number + " with total votes = " + winner_votes);
        f_show_the_second_candidates(vector_votes, winner_number);
    }

    public static void f_show_the_second_candidates(int[] vector_votes, int winner) {
        //description
        int second_candidate = 0, second_votes = 0;
        for (int i = 0; i < vector_votes.length; i++) {
            if (winner != i) {
                if (second_votes < vector_votes[1]) {
                    second_votes = vector_votes[i];
                    second_candidate = i;

                }
            }
            System.out.println("the second candidate is " + second_candidate + "with total votes of " + second_votes);
        }
    }
    public static void f_show_all_votes(int[] vector_votes){
        //description
        int total_votes=0;
        for (int i=0;i<vector_votes.length;i++){
            total_votes =vector_votes[i];
            System.out.println("the votes of the candidates ("+(i+1));

        }

    }
}

