//Given an sorted array arr[] of integers. 
//Sort the array into a wave-like array(In Place). 
//in other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5]....and so on.
//If there are multiple solutions, find the lexicographically smallest one.
//Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

package arrays;
public class WaveArray {
    public static int[] wave(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            // Swap arr[i] and arr[i + 1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}
