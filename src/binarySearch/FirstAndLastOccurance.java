package binarySearch;

public class FirstAndLastOccurance {
   public static int[] firstAndLastOccurence(int[] arr, int target) {
        int first = -1;
        int last = -1;

        // Find the first occurrence
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid; // Update first and continue searching in the left half
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // Find the last occurrence
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid; // Update last and continue searching in the right half
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return new int[]{first, last}; // Return the indices of the first and last occurrences
    } 
}
