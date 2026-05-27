package pattern;
import java.util.Scanner;
public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of triangle: ");
        int row = sc.nextInt();

        if (row <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        for (int x = 1; x <= row; x++) {
            for (int y = 1; x+y <= row+1; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
