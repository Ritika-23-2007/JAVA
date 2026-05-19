package if_else;
import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {
            System.out.println("The number is a four-digit number.");
        } else {
            System.out.println("The number is not a four-digit number.");
        }
        sc.close();
    }
}
