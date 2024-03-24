import java.util.*;

public class Chapter4ProgrammingChallenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive non integer value. ");
        int userInt = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= userInt; i++) {
            total += i;
        }

        System.out.println("The sum of integers from 1 to " + userInt + " is " + total);

        sc.close();
    }
}