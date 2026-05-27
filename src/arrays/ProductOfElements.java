package arrays;
import java.util.Scanner;
public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            sc.close();
            return;
        }

        int[] array1 = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        long product = 1;
        for (int i = 0; i < size; i++) {
            product *= array1[i];
        }

        System.out.println("Product of all elements in the array: " + product);
        sc.close();
    }
}
