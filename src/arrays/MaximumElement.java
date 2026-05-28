package arrays;
import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = CreateIntArray.createIntArray(sc);
        
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
        sc.close();
    }
}
