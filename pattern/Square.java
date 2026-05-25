package pattern;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the square side length: ");
        int side = sc.nextInt();

        if (side <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        //Print Square
        for (int length = 1; length <= side; length++) {
            for (int breadth = 1; breadth <= side; breadth++) {
                System.out.print("*");
            }
            System.out.println();
         }
         sc.close();
    }
}
