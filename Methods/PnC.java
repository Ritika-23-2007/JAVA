package Methods;
import java.util.Scanner;
public class PnC {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        
        if (n <= 0 || r <= 0 ) {
            System.out.println("n and r must be positive integers.");
            sc.close();
            return;
        }
        if (r > n) {
            System.out.println("r cannot be greater than n.");
            sc.close();
            return; 
    }
        int nFactorial = factorial( n );
        int rFactorial = factorial(r);
        int nMinusRFactorial = factorial(n - r);
        
        int permutations = nFactorial / nMinusRFactorial;
        int combinations = nFactorial / (rFactorial * nMinusRFactorial);
        
        System.out.println("Permutations (nPr) of " + n + " and " + r + " is: " + permutations);
        System.out.println("Combinations (nCr) of " + n + " and " + r + " is: " + combinations);
        
        sc.close();
}}