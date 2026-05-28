package arrays;
import java.util.Scanner;
public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = CreateIntArray.createIntArray(sc);

        System.out.println("Negative numbers in the array are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        sc.close();
    }
}
