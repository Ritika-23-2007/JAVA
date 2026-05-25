package loops;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input rows values
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //Printing rectangle
        for ( int x = 1; x <= rows; x++) {
            for (int y = 1; y <= columns; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}