import java.util.Random;
import java.util.Scanner;

public class Chapter5ProgrammingChallenge18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int correctGuesses = 0;

        //For loop to go through each round and increment 
        for (int round = 0; round < 10; round++) {
            int colorChoice = rand.nextInt(5);
            String computerColor = getColor(colorChoice);

            System.out.println("Guess the color!\nRed\nGreen\nBlue\nOrange\nYellow");
            String userGuess = sc.nextLine();

            //Check user guess and computer guess
            if (userGuess.equalsIgnoreCase(computerColor)) {
                correctGuesses++;
                System.out.println("You got it!");
            } else {
                System.out.println("Wrong guess");
            }
            System.out.println("You guessed correctly: " + correctGuesses + " out of 10 tries.");
        }

        sc.close();
    }

    public static String getColor(int num) {
        switch (num) {
            case 0: return "Red";
            case 1: return "Green";
            case 2: return "Blue";
            case 3: return "Orange";
            case 4: return "Yellow";
            default: return "Invalid";
        }
    }
}
