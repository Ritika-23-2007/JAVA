package loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the first term: ");
        double a = sc.nextDouble();
        System.out.print("Enter the common factor: ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        //printing the gp
        for( int N=1; N<=n; N++) {
            double an= a*(Math.pow(r,N-1));
            System.out.println(an);
        }

        //closing the scanner class
        sc.close();
    }
}
