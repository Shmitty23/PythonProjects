import java.util.Random;

public class Chapter5ProgrammingChallenge15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int evenCount = 0;
        int oddCount = 0;

        //Generate 100 random integers
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(100);
            if (isEven(num)) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
