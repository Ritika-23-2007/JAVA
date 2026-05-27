package pattern;
import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of tiangle: ");
        int triangle_size = sc.nextInt();

        if (triangle_size <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int value = 1;
        for (int row = 1; row <= triangle_size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(value++);
            }
            System.out.println();
        }
        sc.close();
    }
}
