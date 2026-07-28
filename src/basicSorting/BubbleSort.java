package basicSorting;

//bubble sort is a simple sorting algorithm 
// that repeatedly steps through the list, 
// compares adjacent elements and swaps them if they are in the wrong order. 
// The pass through the list is repeated until the list is sorted.
public class BubbleSort {

    //approach one 
    //uses bubble sort and before every iteration checks if the array is already sorted or not
    //if the array is already sorted then it will return and not perform any further iterations
    //this will reduce the time complexity of the algorithm in best case scenario to O(n)
    //and in all cases except the worst case scenario, the time will reduce.
    //but in worst case scenario the time complexity will worsen because of the extra check for sorted array which will take O(n) time
    
    public static void bubbleSort1(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if(isSorted(arr)) {
                return;
            }
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //approach two
    //uses bubble sort and before starting algo, it checks if the array is already sorted or not
    //if the array is already sorted then it will return and not perform any further iterations
    //this will reduce the time complexity of the algorithm in best case scenario to O(n)
    //and in rest of all time complexity will remain same as O(n^2) .

    public static void bubbleSort2(int[] arr) {
        int length = arr.length;
        if(isSorted(arr)) {
            return;
        }
        for (int i = 0; i < length - 1; i++) {
             for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //approach three
    //uses bubble sort to sort the array and uses a int swapCount variable to keep track of the number of swaps made in each iteration
    //if the swapCount is zero then it means that the array is already sorted and we can return from the function
    //this will reduce the time complexity of the algorithm in best case scenario to O(n)
    //and in rest of all time complexity will remain same as O(n^2) 
    //but it will be better than approach one and two 
    //because it will not check for sorted array in every iteration but only when the swapCount is zero.

    public static void bubbleSort3(int[] arr) {
        int length = arr.length;
        int swapCount = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0) {
                return;
            }
            else swapCount = 0;
        }
    }
     
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
}
