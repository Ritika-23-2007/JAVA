package arrays;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {

        int[] array1 = {91,2,3,4,5};

        System.out.println("Before sorting:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        //to sort write "Arrays.sort(name of array);"
        Arrays.sort(array1);
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
