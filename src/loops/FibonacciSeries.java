package loops;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print("0");
        int a = 0, b = 1;
        for(int i = 1; i < n; i++) {
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
         }
        sc.close();
    }
}
