package twoDArray;
import java.util.Scanner;
public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of the 2 d array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("enter the elements of the 2 d array");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int row = 0;
        for(int i = 0; i < rows; i++) {
            int currentSum = 0;
            for(int j = 0; j < cols; j++) {
                currentSum += arr[i][j];
            }
            if(currentSum > sum) {
                sum = currentSum;
                row = i;
            }
        }
        System.out.println("Row with maximum sum is: " + row);
        System.out.println("Maximum sum is: " + sum);
        //time complexity is O(n*m) where n is the number of rows and m is the number of columns
        //space complexity is O(1) as we are using a constant amount of space to store the sum and row
        sc.close();
    }
}
