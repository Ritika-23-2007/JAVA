import java.util.Scanner;
public class TSA_OfCuboid {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the length of the cuboid: ");
        double length = sc.nextDouble();
        System.out.print ("Enter the width of the cuboid: ");
        double width = sc.nextDouble();
        System.out.print ("Enter the height of the cuboid: ");
        double height = sc.nextDouble();
        double tsa = 2 * (length * width + width * height + height * length);
        System.out.println("The total surface area of the cuboid is: " + tsa);
        sc.close();
    }
}
