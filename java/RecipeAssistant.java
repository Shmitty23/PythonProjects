import java.util.Scanner;

public class RecipeAssistant {
    //Grams per ingredient
    public static final double sugarPerBatch = 200;
    public static final double butterPerBatch = 113.5;
    public static final double flourPerBatch = 250;
    public static final double chocPerBatch = 175;
    public static final double caloriePercookie = 78;//24 cookie per batch
    public static final double eggPerBatch = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Chocolate Chip Recipe Assistant!");

        //Start batches off at 0
        int batches = 0;
        //Asks user how many batches and error checks
        while (batches <= 0) {
            System.out.println("How many batches of cookies would you like?");
            if (sc.hasNextInt()) {
                batches = sc.nextInt();
                if (batches <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        displayIngredients(batches);

        System.out.println("Would you like to see nutritional information? (yes/no)");
        if (sc.next().toLowerCase().startsWith("y")) {
            displayNutrionalInfo(batches);
        }

        while (true) {//Ask if user wants to view each step
            System.out.println("\nWhat step of the recipe would you like to see?(1-7) Enter 0 to exit the recipe assistant.");
            int userChoice = sc.nextInt();

            //Check if user wants to exit
            if (userChoice == 0) {
                System.out.println("Thank you for using Recipe Assistant!");
                break;
           }
           System.out.println(displayStep(userChoice));
        }
        sc.close();
    }
    //Display the needed ingredients in grams
    private static void displayIngredients(int batches) {
        System.out.println("\nIngredients needed for " + batches + " batch(es):");
        System.out.println("- Sugar: " + (sugarPerBatch * batches) + " grams");
        System.out.println("- Butter: " + (butterPerBatch * batches) + " grams");
        System.out.println("- Flour: " + (flourPerBatch * batches) + " grams");
        System.out.println("- Chocolate Chips: " + (chocPerBatch * batches) + " grams");
        System.out.println("- Eggs: " + (eggPerBatch * batches));
    }

    //Display nutrional information
    public static void displayNutrionalInfo(int batches) {
        int totalCookies = batches * 24;
        System.out.println("\nNutrional Information: ");
        System.out.println("Total cookies: " + totalCookies);
        System.out.println("Calories per cookie " + caloriePercookie);
        System.out.println("Total calories: " + (caloriePercookie * totalCookies));
    }

    //return the step user chooses
    public static String displayStep(int userChoice) {
        switch (userChoice) {
            case 1: return "1. Preheat the oven to 375 degrees Fahrenheit";
            case 2: return "2. Mix butter and sugar together until smooth.";
            case 3: return "3. Beat eggs one at a time.";
            case 4: return "4. Add flour gradually and stir.";
            case 5: return "5. Mix in chocolate chips.";
            case 6: return "6. Drop large spoonfuls on a ungreased pan.";
            case 7: return "7. Bake for 10 minutes or until edges are browned.";
            default: return "Invalid number. Please enter a number 1-7.";
        }
    }
}
