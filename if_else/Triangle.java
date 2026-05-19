package if_else;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = sc.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");

            sc.close();
        }
    }
}
