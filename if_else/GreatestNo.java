package if_else;
import java.util.Scanner;
public class GreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input for three numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int greatest =0;

        //comparing the three numbers to find the greatest
        if(a>=b) {
            if(a>=c) { greatest =a;}
            else { greatest = c;}
        }
        else if(b>=a) {
            if(b>=c) { greatest = b;}
            else { greatest = c;}
        }
        else {
            if(c>=a && c>=b) { greatest = c;}
        }

        //printing the greatest number
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }
}
