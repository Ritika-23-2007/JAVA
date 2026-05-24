package loops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user.
        System.out.println("Enter an integer : ");
        long number = sc.nextLong();
        long value = Math.abs(number);

        //Reversing input number.
        int reverse = 0;
        while (value != 0) {
            reverse *= 10;
            reverse += value % 10;
            value /= 10;
        }

        //Print output & close scanner class.
        System.out.println("The reverse of " +number+ " is : " +reverse);
        sc.close();
    }
}
