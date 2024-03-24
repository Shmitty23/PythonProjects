import java.util.Scanner;
import java.util.Random;

public class Chapter4ProgrammingChallenge21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        
        double totalEntered = 0;
        double totalWon = 0;
        String playAgain;
        
        do {
            System.out.print("Enter the amount of money you want to enter into the slot machine: ");
            double amountEntered = sc.nextDouble();
            totalEntered += amountEntered;
            
            String word1 = words[random.nextInt(words.length)];
            String word2 = words[random.nextInt(words.length)];
            String word3 = words[random.nextInt(words.length)];
            
            System.out.println("Slot Machine Results: " + word1 + " " + word2 + " " + word3);
            
            double winnings = calculateWinnings(word1, word2, word3, amountEntered);
            totalWon += winnings;
            System.out.println("You won $" + winnings);
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Total amount entered: $" + totalEntered);
        System.out.println("Total amount won: $" + totalWon);
        
        sc.close();
    }
    
    public static double calculateWinnings(String word1, String word2, String word3, double amountEntered) {
        if (word1.equals(word2) && word2.equals(word3)) {
            return 3 * amountEntered;
        } else if (word1.equals(word2) || word2.equals(word3) || word1.equals(word3)) {
            return 2 * amountEntered;
        } else {
            return 0;
        }
    }
}
