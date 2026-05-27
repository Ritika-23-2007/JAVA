package loops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user.
        System.out.print("Enter an integer: ");
        long number = sc.nextLong();
        long value = Math.abs(number);

        //Reversing input number.
        long reverse = 0;
        while (value != 0) {
            reverse = reverse * 10 + value % 10;
            value /= 10;
        }
        reverse = number < 0 ? -reverse : reverse;

        //Print output & close scanner class.
        System.out.println("The reverse of " + number + " is: " + reverse);
        sc.close();
    }
}
