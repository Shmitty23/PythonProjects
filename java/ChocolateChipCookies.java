import java.util.Scanner;

public class ChocolateChipCookies {

    // Constants for single batch ingredient measurements and nutritional info
    private static final double SUGAR_GRAMS_PER_BATCH = 200; // grams
    private static final double BUTTER_GRAMS_PER_BATCH = 113.5; // grams
    private static final double FLOUR_GRAMS_PER_BATCH = 250; // grams
    private static final double CHOCOLATE_CHIPS_GRAMS_PER_BATCH = 175; // grams
    private static final int EGGS_PER_BATCH = 2;
    private static final double CALORIES_PER_COOKIE = 78; // Average calories per cookie

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many batches they want to make
        System.out.println("Welcome to the Chocolate Chip Cookies Recipe Program!");
        System.out.print("How many batches of cookies would you like to make? ");
        int batches = scanner.nextInt();

        // Calculate and display required ingredients
        displayIngredients(batches);

        // Display nutritional information
        displayNutritionalInfo(batches);

        // Display steps for making cookies
        displaySteps();

        scanner.close();
    }

    private static void displayIngredients(int batches) {
        System.out.println("\nIngredients needed for " + batches + " batch(es):");
        System.out.println("- Sugar: " + (SUGAR_GRAMS_PER_BATCH * batches) + " grams");
        System.out.println("- Butter: " + (BUTTER_GRAMS_PER_BATCH * batches) + " grams");
        System.out.println("- Flour: " + (FLOUR_GRAMS_PER_BATCH * batches) + " grams");
        System.out.println("- Chocolate Chips: " + (CHOCOLATE_CHIPS_GRAMS_PER_BATCH * batches) + " grams");
        System.out.println("- Eggs: " + (EGGS_PER_BATCH * batches));
    }

    private static void displayNutritionalInfo(int batches) {
        // Assume 24 cookies per batch
        int totalCookies = batches * 24;
        System.out.println("\nNutritional Information:");
        System.out.println("Total cookies: " + totalCookies);
        System.out.println("Calories per cookie: " + CALORIES_PER_COOKIE);
        System.out.println("Total calories: " + (CALORIES_PER_COOKIE * totalCookies));
    }

    private static void displaySteps() {
        String[] steps = {
            "1. Preheat the oven to 375 degrees Fahrenheit (190 degrees Celsius).",
            "2. Cream together the butter and sugar until smooth.",
            "3. Beat in the eggs, one at a time.",
            "4. Stir in the flour gradually.",
            "5. Mix in the chocolate chips.",
            "6. Drop by large spoonfuls onto ungreased pans.",
            "7. Bake for about 10 minutes in the preheated oven, or until edges are nicely browned."
        };

        System.out.println("\nSteps:");
        for (String step : steps) {
            System.out.println(step);
        }
    }
}
