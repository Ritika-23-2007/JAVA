package loops;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter the side dimension: ");
        int side = sc.nextInt();

        if (side <= 0 ) {
            System.out.println("Please enter a positive integer only.");
        }
        else {
            //Print Square
            for (int length = 1; length <= side; length++) {
                for (int breadth = 1; breadth <= side; breadth++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
