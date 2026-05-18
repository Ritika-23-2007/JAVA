import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of a sphere with radius " + radius + " is: " + volume);
        sc.close();
    }
}
