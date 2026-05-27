package pattern;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in triangle: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        for (int x = 1; x <= rows; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
