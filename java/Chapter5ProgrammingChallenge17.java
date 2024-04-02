import java.util.Random;
import java.util.Scanner;

public class Chapter5ProgrammingChallenge17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            int computerChoice = rand.nextInt(3) + 1; 
            // Generates a number between 1 and 3
            String userChoice = getUserChoice(sc);
            String computerChoiceStr = numberToChoice(computerChoice); 
            // Convert number to string choice
            System.out.println("Computer's choice: " + computerChoiceStr);
            
            String result = determineWinner(userChoice, computerChoiceStr);
            System.out.println(result);
            
            if (!result.equals("It's a tie! Play again.")) break;
            // Exit loop if not a tie
        }
    }

    public static String numberToChoice(int number) {
        switch (number) {
            case 1: return "rock";
            case 2: return "paper";
            case 3: return "scissors";
            default: return "Invalid";
        }
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (rock, paper, scissors): ");
        return scanner.nextLine().toLowerCase();
    }

    public static String determineWinner(String userChoice, String computerChoice) {

        if (userChoice.equals(computerChoice)) {
            return "It's a tie! Play again.";
        }
        
        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "Rock smashes scissors. You win!" : "Paper wraps rock. You lose!";
            case "paper":
                return (computerChoice.equals("rock")) ? "Paper wraps rock. You win!" : "Scissors cuts paper. You lose!";
            case "scissors":
                return (computerChoice.equals("paper")) ? "Scissors cuts paper. You win!" : "Rock smashes scissors. You lose!";
            default:
                return "Invalid user choice.";
        }
    }
}
