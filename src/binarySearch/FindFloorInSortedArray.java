package binarySearch;
//given a sorted array arr[] and an integer x, 
// find the index of the largest element in arr[] which is smaller than or equal to x.
//this element is called the floor of x in arr[]. If there is no floor then return -1.
//in case of multiple occurrences of floor, return the index of the last occurrence.
public class FindFloorInSortedArray {
    public static int findFloor(int[]arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = mid; 
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return floor;
    }
}
