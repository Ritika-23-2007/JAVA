//Multiply odd indexed elements by 2 and add 10 to even indexed elements in array and print the new array.
package arrays;
import java.util.Scanner;
public class Question1 {

    public static void printArray(int[] array) {
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] modifyArray(int[] array) {
        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { // Even indexed element
                modifiedArray[i] = array[i] + 10;
            } else { // Odd indexed element
                modifiedArray[i] = array[i] * 2;
            }
        }
        return modifiedArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = CreateIntArray.createIntArray(sc);
        
        System.out.println("Original array:");
        printArray(array);
        int[] modifiedArray = modifyArray(array);
        System.out.println("Modified array:");
        printArray(modifiedArray);
        sc.close();
    }
}
