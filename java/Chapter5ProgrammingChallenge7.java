import java.util.Scanner;

public class Chapter5ProgrammingChallenge7 {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter score #1: ");
        double score1 = sc.nextDouble();

        System.out.println("Enter score #2: ");
        double score2 = sc.nextDouble();

        System.out.println("Enter score #3: ");
        double score3 = sc.nextDouble();

        System.out.println("Enter score #4: ");
        double score4 = sc.nextDouble();

        System.out.println("Enter score #5: ");
        double score5 = sc.nextDouble();

        //print average score
        double average = calcAverage(score1, score2, score3, score4, score5);
        System.out.println("The average of your scores is: " + average);

        //print grade
        System.out.println("Letter grade for score #1 is " + determineGrade(score1));
        System.out.println("Letter grade for score #2 is " + determineGrade(score2));
        System.out.println("Letter grade for score #3 is " + determineGrade(score3));
        System.out.println("Letter grade for score #4 is " + determineGrade(score4));
        System.out.println("Letter grade for score #5 is " + determineGrade(score5));

        sc.close();
    }
    //method to calculate the average of all scores
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
        return (score1 + score2 + score3 + score4 + score5);
    }
    // method to calculate the users grade
    public static String determineGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F"; 
    }
}