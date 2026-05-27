package if_else;
import java.util.Scanner;
public class Recatngle {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //taking input for length and width of the rectangle
        System.out.print ("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print ("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        //calculating the area of the rectangle
        double area = Math.abs(length) * Math.abs(width);
        System.out.println("The area of the rectangle is: " + area);

        //calculating the perimeter of the rectangle
        double perimeter = 2 * (Math.abs(length) + Math.abs(width));
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        //comparing the area and perimeter of the rectangle
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else if (area < perimeter) {
            System.out.println("The area of the rectangle is less than its perimeter.");
        } else {
            System.out.println("The area of the rectangle is equal to its perimeter.");
        }
        sc.close();
    }
}
