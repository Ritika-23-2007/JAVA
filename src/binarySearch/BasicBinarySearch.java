package binarySearch;

public class BasicBinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
//to find the middle index, we use the formula (left + right) / 2. However, to avoid potential overflow, we can use the formula left + (right - left) / 2 instead.            
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
        //time complexity is O(log n) because with each iteration, the search space is halved. 
        // The space complexity is O(1) since we are using a constant amount of extra space.

//follow up 1 : if array is sorted in descending order.
//follow up 2 : if array is rotated sorted array.
//follow up 3 : if array contains duplicates. and return the first occurrence of the target.         
    }
}
    