package arrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = CreateIntArray.createIntArray(sc);
        
        int min = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
        sc.close();
    }
    
}
