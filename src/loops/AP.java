package loops;
import java.util.Scanner;
public class AP {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //taing input from user
        System.out.print("Enter the first number of AP :");
        double a = sc.nextDouble();
        System.out.print("Enter the common difference:");
        double d = sc.nextDouble();
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();

        // forming and printing ap
        for(int N=1; N<=n; N++) {
            double an = a+((N-1)*d);
            System.out.println(an);
        }

        //close the scanner 
        sc.close();
    }
}


