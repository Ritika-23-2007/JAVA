package arrays;
import java.util.Scanner;
public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            sc.close();
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Negative numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        sc.close();
    }
}
