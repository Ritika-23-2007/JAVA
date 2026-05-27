package pattern;
import java.util.Scanner;
public class Spiral {
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
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(i + " ");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(i + " ");
            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//lower part
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(rows - i + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(rows - i + " ");
            }
            for (int j = 1; j <= rows - i - 1; j++) {
                System.out.print(rows - i - j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
