import java.util.*;

public class AverageScore {
    public static void main(String[] args) {
        //Assign variables
        double score1, score2, score3, averageScore;

        //Create new scanner
        Scanner sc = new Scanner(System.in);

        //Grab input
        System.out.println("This program averages the 3 test scores.");

        System.out.println("Enter score #1: ");
        score1 = sc.nextDouble();

        System.out.println("Enter score #2: ");
        score2 = sc.nextDouble();

        System.out.println("Enter score #3: ");
        score3 = sc.nextDouble();

        // calculate and display average
        averageScore = (score1 + score2 + score3) / 3.0;

        //Output average score
        System.out.println("The average score is: " + averageScore);

        //If average score is greater than 95 Congratulate user
        if (averageScore > 95)
            System.out.println("That's a great score!!");

        sc.close();
    }
}
