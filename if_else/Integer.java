package if_else;
import java.util.Scanner;   
public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double realNumber = scanner.nextDouble();
        String numtype;

        if (realNumber == (int) realNumber) {
            numtype = "integer";
        } else {
            numtype = "not an integer";
        }

        System.out.println(realNumber + " is " + numtype + ".");
        scanner.close();
    }
}
