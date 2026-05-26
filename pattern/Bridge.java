package pattern;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive integer for rows.");
            sc.close();
            return;
        }
//print top row        
        for (int top_row = 1; top_row <= 2*rows-1; top_row++) {
            System.out.print("* ");
        }
        System.out.println();
//print remaining temptlate
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= rows - i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rows - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
