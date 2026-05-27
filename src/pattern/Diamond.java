package pattern;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive integer for rows.");
            sc.close();
            return;
        }
//upper part
        for (int i = 1; i <= rows; i++) {
            //print spaces in upper part            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            //print stars in upper part             
            for (int j = 1; j <=2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//lower part
        for (int i = 1; i <= rows -1; i++) {
            //print spaces in lower part
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            //print stars in lower part
            for (int j = 1; j <= 2*(rows - i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
