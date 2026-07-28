package basicSorting;
public class SelectionSort { 

    public static void sort(int[] array) {
        int min;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    //element at index j is smaller than the current minimum
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
    //time complexity: O(n^2)
    //space complexity: O(1)
}