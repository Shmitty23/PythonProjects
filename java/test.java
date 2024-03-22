import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = sc.nextLine();

        System.out.println("How old are you? ");
        int userAge = sc.nextInt();

        sc.nextLine();

        System.out.println("Where do you live? ");
        String userLocation = sc.nextLine();

        System.out.println(userName + " lives in " + userLocation + " and is " + userAge + " years old.");
    }
}
