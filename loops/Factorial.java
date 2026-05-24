package loops;
import java.util.Scanner;
public class Factorial {

    public static int give_factorial(int number) {
        int factorial = 1;
        for (int n = 1; n <= number ; n++) {
        factorial *= n;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int input = sc.nextInt();
        System.out.println("The factorial of " + input + " is: " + give_factorial(input));
        sc.close();
    }
}