package pattern;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Read rectangle dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //Printing rectangle
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= columns; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}