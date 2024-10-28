package Arrays.Accenture_qs;

//Write a Java program to play the classic "Rock, Paper, Scissors" game.
// The game will have multiple rounds, and in each round, both players input
// their choices. The winner of each round is determined based on the rules:
//
//Rock beats Scissors
//Scissors beats Paper
//Paper beats Rock
//At the end of all rounds, the program should print the total wins for both
// players and declare the overall winner or a draw if both players have
// equal wins.

import java.util.Scanner;

public class RockPaperScissors {

    // Method to determine the winner of a single round
    public static String getWinner(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw";
        } else if ((player1.equals("Rock") && player2.equals("Scissors")) ||
                (player1.equals("Scissors") && player2.equals("Paper")) ||
                (player1.equals("Paper") && player2.equals("Rock"))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1Wins = 0, player2Wins = 0;

        System.out.print("Enter the number of rounds: ");
        int rounds = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i + ":");

            System.out.print("Player 1, enter your choice (Rock, Paper, Scissors): ");
            String player1 = scanner.nextLine().trim();

            System.out.print("Player 2, enter your choice (Rock, Paper, Scissors): ");
            String player2 = scanner.nextLine().trim();

            String winner = getWinner(player1, player2);

            if (winner.equals("Player 1")) {
                player1Wins++;
                System.out.println("Player 1 wins this round!");
            } else if (winner.equals("Player 2")) {
                player2Wins++;
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("This round is a draw!");
            }
        }

        System.out.println("\nFinal Results:");
        System.out.println("Player 1 won " + player1Wins + " rounds.");
        System.out.println("Player 2 won " + player2Wins + " rounds.");

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 is the overall winner!");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player 2 is the overall winner!");
        } else {
            System.out.println("The game is a draw!");
        }

        scanner.close();
    }
}

