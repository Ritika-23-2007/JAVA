package pattern;
import java.util.Scanner;
public class VerticalFlipNoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        if (rows <= 0) {
            System.out.println("Please enter a positive integer for rows.");
            sc.close();
            return;
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; i+j <= rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}