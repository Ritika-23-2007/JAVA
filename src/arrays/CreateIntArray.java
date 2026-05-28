package arrays;
import java.util.Scanner;   
public class CreateIntArray {
    public static int[] createIntArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            return null; // Return null to indicate an invalid array size
        }
        int[] array1 = new int[size];
        System.out.println("Enter the " + size + " integers of the array:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        return array1; // Return the created array
    }
}
