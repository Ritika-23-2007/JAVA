package if_else;
import java.util.Scanner;
public class Absolute_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }

        System.out.println("The absolute value of the number is: " + number);

        scanner.close();
    }
}
