package arrays;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = CreateIntArray.createIntArray(sc);

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
        sc.close();
    }
}
