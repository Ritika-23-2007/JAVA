package twoDArray;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = i + j;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
