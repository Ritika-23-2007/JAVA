package pattern;
import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Please enter positive integral values.");
            sc.close();
            return;
        }

        for (int row = 1; row <= breadth; row++) {
            for (int column = 1; column <= length; column++) {
                if (row == 1 || column == 1 || row == breadth || column == length) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
