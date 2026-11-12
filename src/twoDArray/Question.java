package twoDArray;
//find the minimum element out of all the maximum elements of each row in a 2D array
import java.util.Scanner;
public class Question {
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
        int[] maxElements = new int[rows];
        for(int i = 0; i < rows; i++) {
            int max = arr[i][0];
            for(int j = 1; j < cols; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxElements[i] = max;
        }
        int min = maxElements[0];
        for(int i = 1; i < rows; i++) {
            if(maxElements[i] < min) {
                min = maxElements[i];
            }
        }
        System.out.println("Minimum element out of all the maximum elements is: " + min);
        sc.close();
    }
}
