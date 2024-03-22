import java.util.*;

public class Division {
    public static void main(String[] args) {
        double number1, number2;
        double quotient;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number1 = sc.nextDouble();

        System.out.println("Enter another number: ");
        number2 = sc.nextDouble();

        if (number2 == 0)
        {
            System.out.println("Division by 0 is not possible.");
            System.out.println("Please run the program again.");
            System.out.println("Enter a number other than zero.");
        }
        else
        {
            quotient = number1 / number2;
            System.out.println("The quotient of " + number1);
            System.out.println("divided by " + number2);
            System.out.println("is " + quotient);
        }

        sc.close();
    }
}
