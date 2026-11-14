package twoDArray;
import java.util.Scanner;
public class Transpose {
    public static void printMatrix(int[][] arr) {
        for(int[] row : arr) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size of the square matrix:");
        int n = sc.nextInt();

    if (n <= 0) {
        System.out.println("Matrix size must be greater than 0.");
        sc.close();
        return;
    }
        int[][] arr = new int[n][n];
    
        System.out.println("Enter the elements of the 2D array:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr);

        sc.close();
    }
}
