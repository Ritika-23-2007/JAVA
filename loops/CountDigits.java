package loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking imput number from user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        //counting and printing number of digits
        int count=0;
        while(num!=0) {
            num/=10;
            count++;
        }
        System.out.println("The number of digits in input number is : " +count);

        sc.close();
    }
}
