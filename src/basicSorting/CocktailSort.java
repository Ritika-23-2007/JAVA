package basicSorting;

public class CocktailSort {
    public static void cocktailSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean swapped = true;
        //while swapped is true and start is less than end, continue sorting
        while (start < end) {
            swapped = false;
            for (int j = start; j < end; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
            end--;
            swapped = false;
            for (int k = end ; k > start; k--) {
                if (arr[k] < arr[k - 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
            start++;
        }
    }
}
