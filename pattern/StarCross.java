package pattern;
import java.util.Scanner;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of cross (odd nnumbers only) :");
        int cross_size = sc.nextInt();

        if (cross_size <= 0 || cross_size % 2 == 0) {
            System.out.println("Please enter an odd (positive) number only");
            sc.close();
            return;
        }
        for (int row = 1; row <= cross_size; row++) {
            for (int column =1; column <= cross_size; column++) {
                if (row == column || row + column == cross_size + 1) {
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
