package basicSorting;

public class MoveZerosToEnd {

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

    // using two pointer approach
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
    public static void main(String[] args) {

    }}

