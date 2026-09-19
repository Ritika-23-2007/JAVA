package basicSorting;

public class K_thSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        //sort using selection sort
        int minIndex = 0;
        for (int i = 0; i < k; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[k - 1];
    }
}
//issues- doesn't handle invalid k values (k<=0 or k>arr.length) or null or empty array.
//input array is modified in place, which may not be desirable in some cases.
//version 1 consider duplicates as unique elements
//version 2 count duplicate elements as one and ingnore repeteated 
