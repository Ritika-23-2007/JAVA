package arrays;
import java.util.Scanner;
public class ReversePartOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = CreateIntArray.createIntArray(sc);
        System.out.print("Enter the starting index of the part to reverse: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter the ending index of the part to reverse: ");
        int endIndex = sc.nextInt();

        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        System.out.println("Array with reversed part:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
