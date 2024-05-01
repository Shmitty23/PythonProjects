import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Chapter7ProgrammingChallenge7 {
    public static void main(String[] args) {
        List<String> responses = loadResponses();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Magic 8 Ball Simulator!");
        String input;
        
        do {
            System.out.println("\nAsk a yes/no question (type 'quit' to exit): ");
            input = sc.nextLine();
            
            if (!"quit".equalsIgnoreCase(input)) {
                int index = rand.nextInt(responses.size());
                System.out.println(responses.get(index));
            }
        } while (!"quit".equalsIgnoreCase(input));

        System.out.println("Thank you for using the Magic 8 Ball. Goodbye!");
        sc.close();
    }

    private static List<String> loadResponses() {
        List<String> responses = new ArrayList<>();
        responses.add("Yes, of course!");
        responses.add("Without a doubt, yes.");
        responses.add("You can count on it.");
        responses.add("For sure!");
        responses.add("Ask me later.");
        responses.add("I`m not sure.");
        responses.add("I can`t tell you right now.");
        responses.add("I`ll tell you after my nap.");
        responses.add("No way!");
        responses.add("I don`t think so.");
        responses.add("Without a doubt, no.");
        responses.add("The answer is clearly NO.");
        return responses;
    }
}
