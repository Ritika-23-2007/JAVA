package basicSorting;

import java.util.ArrayList;
import java.util.Arrays;

//given two integer arrays, return the list of  elements common to both the arrays.
//return the list in a sorted order.
//for duplicate elements, repeat the element in the output as many times as it appears in both arrays.

public class CommonElements {
    public static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2) {

        ArrayList<Integer> commonElements = new ArrayList<>();

        //approach:
        //sort both arrays
        //put a pointer on each array and compare elements of both arrays.
        //for same elements, add to the output list and move both pointers forward.
        //for different elements, move the pointer of the array with the smaller element forward.

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
//time complexity: O(nlogn + mlogm + min(n,m)) where n and m are the lengths of the two arrays
//space complexity: O(min(n,m)) for the output list
        return commonElements;
    }
}
