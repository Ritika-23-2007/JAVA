package loops;
import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the integral value of n: ");
        int n = sc.nextInt();

        //printing the number sequence
        for(int N = 1 ; N<= n-(N-1); N++) {
            System.out.println(N);
            System.out.println(n-(N-1));
        }

        //closing the scaner class
        sc.close();
    }
}
