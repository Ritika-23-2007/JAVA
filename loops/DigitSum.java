package loops;
import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from the user.
        System.out.print("Enter an integer : ");
        int number = sc.nextInt();
        //int value = Math.abs(number);
        int value = number;
        
        //Calculating sum of digits
        int sum = 0;
        while (value != 0) {
            sum += value % 10; 
            value /= 10;
        }

        //Print result and close scanner class.
        System.out.println("The sum of digits of " + number + " is : " + sum+ ".");
        sc.close();
    }
}
