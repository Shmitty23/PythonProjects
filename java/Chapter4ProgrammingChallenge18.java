import java.util.Random;
import java.util.Scanner;

public class Chapter4ProgrammingChallenge18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("I have a randomly chosen number between 1 and 100.");
        System.out.println("Try to guess it!");

        int userGuess = 0;
        int userGuesses = 0;

        while (userGuess != randomNumber) {
            System.out.print("Your guess: ");
            userGuess = sc.nextInt();
            userGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("Too low try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high try again!");
            } else {
                System.out.println("You guessed the correct number!");
                System.out.println("You guessed " + userGuesses + " times.");
            }
        }
        sc.close();
    }
}
