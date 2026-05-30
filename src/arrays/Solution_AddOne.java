//Given a non-negative integer(without leading zeroes) represented as an array arr.
//  Your task is to add 1 to the number (increment the number by 1). 
// The digits are stored such that the most significant digit is at the starting index of the array.

// Examples:

// Input: arr[] = [5, 6, 7, 8]
// Output: [5, 6, 7, 9]
// Explanation: 5678 + 1 = 5679

// Input: arr[] = [9, 9, 9]
// Output: [1, 0, 0, 0]
// Explanation: 999 + 1 = 1000

package arrays;

public class Solution_AddOne {
    public static int[] addOne(int[] arr) {
        int n = arr.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the array
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            arr[i] = 0;
        }

        // If all digits were 9, we need to add a new digit at the beginning
        int[] newArr = new int[n + 1];
        newArr[0] = 1; // Set the first digit to 1
        return newArr;
    }
}
