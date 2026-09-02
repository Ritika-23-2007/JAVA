package basicSorting;

public class BubbleSortDescending {
    public static void bubbleSortDescending(int[] arr) {
        int length = arr.length;
        int swaps;
        for (int i = 0; i < length-1; i++) {
            swaps = 0;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j+1] > arr[j]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) {
                return;
            }
        }
        //time complexity worst case: O(n^2)
        //time complexity best case: O(n)
        //no of opeations in worst case: n(n-1)/2
        //space complexity: O(1)
    }
}
