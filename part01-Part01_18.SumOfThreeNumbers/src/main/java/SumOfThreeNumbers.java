
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = scanner.nextInt();
        System.out.println("Give the second number:");
        int second = scanner.nextInt();
        System.out.println("Give the third number:");
        int third = scanner.nextInt();
        System.out.println("The sum of the numbers is " + (first + second + third));
    }
}
