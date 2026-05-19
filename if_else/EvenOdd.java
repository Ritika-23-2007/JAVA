package if_else;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        String type ;
        if (number % 2 == 0) {
            type = "even";
        } else {
            type = "odd";
        }
        System.out.println(number + " is an " + type + " number.");

        

        scanner.close();
    }
}
