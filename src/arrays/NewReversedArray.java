package arrays;
import java.util.Scanner;
public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalArray = CreateIntArray.createIntArray(sc);
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nReversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
