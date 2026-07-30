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

    // using two pointer (opposite direction) approach
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

    // using two pointer (same direction) approach

    //using summing technique and then overwriting the array with non-zero elements and then filling the rest of the array with zeros
    public static void main(String[] args) {

    }
}

