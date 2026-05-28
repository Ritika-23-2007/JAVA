package arrays;
import java.util.Scanner;
public class SearchInArray {
    public static void search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] array1 = new int[size];
        System.out.println("Enter the " + size + " integers of the array:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter the integer to search: ");
        int target = sc.nextInt();
        search(array1, target);
        sc.close();
    }
}