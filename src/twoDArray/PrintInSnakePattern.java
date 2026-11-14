package twoDArray;
import java.util.Scanner;
public class PrintInSnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the 2D array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than zero.");
            sc.close();
            return;
        }
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array in snake pattern is:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            i++;
            if(i < rows) {
                for(int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
