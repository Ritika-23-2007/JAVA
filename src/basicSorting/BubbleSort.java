package basicSorting;
import java.util.Scanner;
import java.util.Arrays;
import arrays.CreateIntArray;

//bubble sort is a simple sorting algorithm 
// that repeatedly steps through the list, 
// compares adjacent elements and swaps them if they are in the wrong order. 
// The pass through the list is repeated until the list is sorted.
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if(isSorted(arr)) {
                return;
            }
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = CreateIntArray.createIntArray(sc);
        System.out.println("Before sorting:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
}
