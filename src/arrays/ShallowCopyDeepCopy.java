package arrays;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr1));

        // Shallow copy- same array but different name
        int[] shallowCopy = arr1;
        System.out.println("Shallow copy: " + Arrays.toString(shallowCopy));

        // Modifying the shallow copy- since both arr1 and shallowCopy refer to the same array, changes will affect both
        shallowCopy[0] = 10;
        System.out.println("After modifying shallow copy:");
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Shallow copy: " + Arrays.toString(shallowCopy));

        // Deep copy- creating a new array and copying the values from the original array
        int[] deepCopy = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            deepCopy[i] = arr1[i];
        }
        System.out.println("Deep copy: " + Arrays.toString(deepCopy));

        // Modifying the deep copy- since deepCopy is a separate array, changes will only affect the deep copy
        deepCopy[0] = 20;
        System.out.println("After modifying deep copy:");
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Deep copy: " + Arrays.toString(deepCopy));

        // Using Arrays.copyOf for deep copy
        int[] deepCopyUsingMethod = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Deep copy using Arrays.copyOf: " + Arrays.toString(deepCopyUsingMethod));
    }
}
