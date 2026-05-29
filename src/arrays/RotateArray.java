package arrays;
public class RotateArray {
    public static int[] rotateLeft(int[] array, int k) {
        k = k % array.length; // Handle cases where k is greater than array length
        ReverseArray.reversePartial(array, 0, k - 1); // Reverse the first k elements
        ReverseArray.reversePartial(array,  k, array.length - 1); // Reverse the remaining elements
        ReverseArray.reverseComplete(array); // Reverse the entire array

        return array;
    }
    public static int[] rotateRight(int[] array, int k) {
        k = k % array.length; // Handle cases where k is greater than array length
        ReverseArray.reversePartial(array, 0, array.length - k - 1); // Reverse the first n-k elements
        ReverseArray.reversePartial(array, array.length - k, array.length - 1); // Reverse the last k elements
        ReverseArray.reverseComplete(array); // Reverse the entire array

        return array;
    }
}
