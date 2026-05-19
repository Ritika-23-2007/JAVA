package if_else;
import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = sc.nextDouble();

        if(x>0 && y>0) {
            System.out.println("The point (" + x + ", " + y + ") is in the first quadrant.");
        } else if(x<0 && y>0) {
            System.out.println("The point (" + x + ", " + y + ") is in the second quadrant.");
        } else if(x<0 && y<0) {
            System.out.println("The point (" + x + ", " + y + ") is in the third quadrant.");
        } else if(x>0 && y<0) {
            System.out.println("The point (" + x + ", " + y + ") is in the fourth quadrant.");
        } else if(x==0 && y!=0) {
            System.out.println("The point (" + x + ", " + y + ") is on the y-axis.");
        } else if(x!=0 && y==0) {
            System.out.println("The point (" + x + ", " + y + ") is on the x-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        }
        sc.close();
    }   
}
