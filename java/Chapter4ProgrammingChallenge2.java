import java.util.*;

public class Chapter4ProgrammingChallenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed of the vehicle in miles per hour: ");
        double speed = sc.nextDouble();

        while (speed < 0) {
            System.out.println("Please enter a non negative speed: ");
            speed = sc.nextDouble();
        }

        System.out.println("Enter the number of hours the vehicle has traveled: ");
        int hours = sc.nextInt();

        while (hours < 1) {
            System.out.println("Please enter a time greater than 0: ");
            hours = sc.nextInt();
        }

        System.out.println("\nHour\tDistance Traveled");
        System.out.println("-------------------------");

        for (int hour = 1; hour <= hours; hour++) {
            double distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }

        sc.close();
    }
}
