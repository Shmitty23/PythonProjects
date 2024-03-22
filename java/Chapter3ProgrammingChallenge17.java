import java.util.*;

public class Chapter3ProgrammingChallenge17 {
    public static void main(String[] args) {
        // New scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem? (Y/N)");
        String userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("n")) {
            System.out.println("Reboot the router and try to connect.");
            System.out.println("Did that fix the problem? (Y/N)");
            userInput = sc.nextLine();
            
            if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Make sure the cables are firmly plugged in to the router and modem.");
                System.out.println("Did that fix the problem? (Y/N)");
                userInput = sc.nextLine();

                if (userInput.equalsIgnoreCase("n")) {
                    System.out.println("Move the router to a new location and try to connect.");
                    System.out.println("Did that fix the problem? (Y/N)");
                    userInput = sc.nextLine();

                    if (userInput.equalsIgnoreCase("n")) {
                        System.out.println("Get a new router.");
                        
                    } else {
                        System.out.println("Great! Have a good day!");
                    }

                } else {
                    System.out.println("Great! Have a good day!");
                }

            } else {
                System.out.println("Great! Have a good day!");
            }

        } else if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Great! Have a good day!");

        } else {
            System.out.println("Invalid input");
        }

        // Close scanner
        sc.close();
    }
}
