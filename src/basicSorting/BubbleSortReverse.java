package basicSorting;

public class BubbleSortReverse {
    public static void bubbleSortReverse(int[] arr) {
        int length = arr.length;
        int swaps;
        for (int i = 0; i < length-1; i++) {
            swaps = 0;
            for(int j = length-1; j > i; j--) {
                if (arr[j] < arr[j-1]) {
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaps++;

                }
            }
            if(swaps == 0) {
                return;
            }
        }
    }

}
