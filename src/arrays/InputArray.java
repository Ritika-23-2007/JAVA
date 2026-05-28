package arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] userArray = CreateIntArray.createIntArray(sc);

        System.out.println("You entered the following integers:");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        sc.close();
    }
}
