import java.util.Scanner;

public class Chapter3ProgrammingChallenge18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for dietary restrictions
        System.out.println("Do any members of your party have dietary restrictions?");
        System.out.println("Vegetarian? (yes/no): ");
        String vegetarianInput = sc.nextLine().toLowerCase();
        boolean isVegetarian = vegetarianInput.equals("yes");

        System.out.println("Vegan? (yes/no): ");
        String veganInput = sc.nextLine().toLowerCase();
        boolean isVegan = veganInput.equals("yes");

        System.out.println("Gluten-Free? (yes/no): ");
        String glutenFreeInput = sc.nextLine().toLowerCase();
        boolean isGlutenFree = glutenFreeInput.equals("yes");

        // Display restaurant options based on dietary restrictions
        System.out.println("Restaurant options:");

        if (!isVegetarian || !isVegan || !isGlutenFree) {
            System.out.println("Joe’s Gourmet Burgers");
        }

        if (isVegetarian && isGlutenFree) {
            System.out.println("Main Street Pizza Company");
        }

        if (isVegetarian && isVegan && isGlutenFree) {
            System.out.println("Corner Cafe");
            System.out.println("The Chef’s Kitchen");
        }

        if (isVegetarian && !isVegan && !isGlutenFree) {
            System.out.println("Mama’s Fine Italian");
        }
        
        sc.close();
    }
}
