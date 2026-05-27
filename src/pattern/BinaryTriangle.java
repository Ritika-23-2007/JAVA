package pattern;
import java.util.Scanner;
public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of triangle: ");
        int triangle_size = sc.nextInt();

        if (triangle_size <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        for (int row = 1; row <= triangle_size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print((row + column) % 2 == 0 ? 1 : 0);
            }
            System.out.println();
        }
        sc.close();
    }
}
