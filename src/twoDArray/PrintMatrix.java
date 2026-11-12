package twoDArray;
//print a 2D array in matrix form columnwise instead of rowwise
import java.util.Scanner;
public class PrintMatrix {
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
        System.out.println("The 2D array in matrix form (column-wise) is:");
        for(int j = 0; j < cols; j++) {
            for(int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
