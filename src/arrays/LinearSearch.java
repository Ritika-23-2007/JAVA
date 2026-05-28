package arrays;
import java.util.Scanner;
public class LinearSearch {
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

        int[] array1 = CreateIntArray.createIntArray(sc);
        
        System.out.print("Enter the integer to search: ");
        int target = sc.nextInt();
        search(array1, target);
        sc.close();
    }
}