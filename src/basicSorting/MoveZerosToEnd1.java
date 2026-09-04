package basicSorting;

public class MoveZerosToEnd1 {

    // using bubble sort approach
    public static void moveZerosToEndBubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // using two pointer (same direction) approach
    public static void moveZerosToEndTwoPointer(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }

    // using two pointer (opp direction) approach- 
    //it can be solved using two pointer approach in opposite direction as well, 
    // where one pointer starts from the beginning and the other from the end of the array. 
    // The first pointer moves forward until it finds a zero, and the second pointer moves backward until it finds a non-zero element. 
    // When both pointers find their respective elements, they swap them. 
    // This process continues until the two pointers meet.
    //but it will not maintain the order of non-zero elements in the array.k
    //and if we maintain order either it will take O(n^2) time complexity or O(n) space complexity.

    //using summing technique and then overwriting the array with non-zero elements 
    // and then filling the rest of the array with zeros
    //but it applies only when the array contains only one element other than zero and that element is known in advance.


