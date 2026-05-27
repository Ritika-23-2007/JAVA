package loops;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input number from the user
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        //finding and printing factors
        for( int factor=1; factor<=num; factor++) {
            if (num%factor==0) {
                System.out.println(factor);
            }
        }
        //closing scanner class
        sc.close();
    }
}

