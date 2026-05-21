package loops;
import java.util.Scanner;
public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input number from user
        System.out.print("Enter a natural number : ");
        int num = sc.nextInt();

        //counting the number of factors of given number
        boolean composite = false;
        for(int factor = 2; factor <= Math.sqrt(num); factor++) {
            if (num%factor==0) {
                composite=true;
                break;
            }
        }

        //printing whether number is composite or not
        if (composite==true) {
            System.out.println("The given number is composite.");
        }
        else {
            System.out.println("The given number is not composite.");

        }
        //closing scanner class
        sc.close();
    }
}
