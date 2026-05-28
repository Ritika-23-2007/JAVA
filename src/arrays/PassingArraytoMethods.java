package arrays;

public class PassingArraytoMethods {

    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // Doubling each element
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(myArray);

        // Modifying the array in the method
        modifyArray(myArray);

        System.out.println("Modified array:");
        printArray(myArray);
    }
}
