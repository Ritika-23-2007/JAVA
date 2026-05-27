package arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            sc.close();
            return;
        }

        int[] userArray = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            userArray[i] = sc.nextInt();
        }

        System.out.println("You entered the following integers:");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i] + " ");
        }
        sc.close();
    }
}
