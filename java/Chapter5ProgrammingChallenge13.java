import java.util.Scanner;
import java.util.Random;

public class Chapter5ProgrammingChallenge13 {
    public static void main(String[] args) {
        //Open scanner and random
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Generate random number between 1-100
        int randInt = rand.nextInt(100);
        System.out.println(randInt + " is prime? " + isPrime(randInt));

        sc.close();
    }

    public static boolean isPrime(int num) {
        //If num is less than or equal to 1 not prime number
        if(num <= 1) {
            return false;
        }
        // check from 2 to num / 2, a number is not dividable by more than half its value
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
