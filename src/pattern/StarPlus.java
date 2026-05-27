package pattern;
import java.util.Scanner;
public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the odd number of row/column: ");
        int plus_size = sc.nextInt();
        
        if (plus_size % 2 == 0 ) {
            System.out.println("pleae enter an odd number.");
            sc.close();
            return;
        }
        for (int row = 1; row <= plus_size; row++) {
            for (int column = 1; column <= plus_size; column++) {
                if (row == (plus_size + 1)/2 || column == (plus_size + 1)/2) {
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
