package twoDArray;
import java.util.Scanner;
public class SumOf2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of all elements in the 2D array is: " + sum);
        sc.close();
        //time complexity is O(n*m) where n is the number of rows and m is the number of columns
        //space complexity is O(1) as we are using a constant amount of space to store the sum
    }
}
