import java.util.Scanner;

public class Chapter6ProgrammingChallenge10 {
    public static void main(String[] args) {
        //Open scanner
        Scanner sc = new Scanner(System.in);

        Die die = new Die(6);
        int playerTotal = 0;
        int compTotal = 0;

        //Computer rolls
        while (compTotal < 16) {
            compTotal += die.roll() + die.roll();
        }
        //Start of program
        System.out.println("Welcome to Dice Blackjack");
        boolean contPlaying = true;

        while (contPlaying && playerTotal <= 21) {
            
            System.out.println("Do you want to roll the dice? (yes/no)");
            String userInput = sc.nextLine();
            
            if (userInput.equalsIgnoreCase("yes")) {
                playerTotal += die.roll() + die.roll();
                System.out.println("Your total is: " + playerTotal);

                if (playerTotal > 21) {
                    System.out.println("You've gone over 21. You lose.");
                    contPlaying = false;
                }
            } else {
                contPlaying = false;
            }
        }

        //Check who wins
        if (playerTotal <= 21) {
            System.out.println("Computer's total: " + compTotal);
            
            if (compTotal > 21 || playerTotal > compTotal) {
                System.out.println("You win!");
            
            } else if (compTotal == playerTotal) {
                System.out.println("Its a tie.");
            
            } else {
                System.out.println("computer wins!");
            }
        }

        sc.close();

    }
}
