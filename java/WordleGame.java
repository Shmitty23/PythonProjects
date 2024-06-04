import java.util.*;

// Class with core game logic
class WordleLogic {
    // Words for the game 
    private final String[] words = {"fiat", "ford", "mini", "audi", "seat", "saab", "opel", "benz", "tata", "jeep"};
    private final String correctWord;
    private int attemptsLeft;

    public WordleLogic() {
        // Attempts start at 6
        this.attemptsLeft = 6;
        // Assign a random word from the words array
        this.correctWord = words[new Random().nextInt(words.length)];
    }

    // Method returns true if the player has used all attempts
    public boolean gameOver() {
        return attemptsLeft == 0;
    }

    // Method to analyze the player's guess
    public String analyzeGuess(String guess) {
        // Check if the player has guessed the correct length word (4 characters in this case)
        if (guess.length() != 4) {
            return "Invalid input, Enter a 4 letter word.";
        }

        StringBuilder feedback = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char c = guess.charAt(i);
            if (correctWord.charAt(i) == c) {
                // Correct letter and correct position
                feedback.append("G");
            } else if (correctWord.contains(Character.toString(c))) {
                // Correct letter but wrong position
                feedback.append("Y");
            } else {
                // Letter not in the correct word
                feedback.append("B");
            }
        }

        attemptsLeft--;
        return feedback.toString();
    }

    // Method returns true if the guessed word is correct
    public boolean isCorrectGuess(String guess) {
        return guess.equals(correctWord);
    }

    // Getter method for the remaining attempts
    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    // Getter method for the correct word
    public String getCorrectWord() {
        return correctWord;
    }
}

// Main class to run the game
public class WordleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordleLogic game = new WordleLogic();

        System.out.println("Welcome to Wordle! Try to guess the 4 letter car word.");
        while (!game.gameOver()) {
            System.out.printf("You have " + game.getAttemptsLeft() + " attempts left. Enter your guess: ");
            String guess = sc.nextLine().toLowerCase();

            if (game.isCorrectGuess(guess)) {
                System.out.println("Good job You guessed the correct word.");
                break;
            } else {
                String feedback = game.analyzeGuess(guess);
                System.out.println("Feedback: " + feedback);
            }
        }

        if (game.gameOver()) {
            System.out.printf("Game over");
        }

        sc.close();
    }
}
