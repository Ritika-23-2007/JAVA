package arrays;
import java.util.Scanner;
public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = CreateIntArray.createIntArray(sc);

        long product = 1;
        for (int i = 0; i < array1.length; i++) {
            product *= array1[i];
        }

        System.out.println("Product of all elements in the array: " + product);
        sc.close();
    }
}
