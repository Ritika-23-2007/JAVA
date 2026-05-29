package arrays;

public class Segregate0s_1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int zeroCount = arr.length - sum;
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }
        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
