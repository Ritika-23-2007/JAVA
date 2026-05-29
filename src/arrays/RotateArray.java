package arrays;
public class RotateArray {
    public static int[] rotateLeft(int[] array, int d) {
        d = d % array.length; // Handle cases where d is greater than array length
        int[] leftRotatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            leftRotatedArray[i] = array[(i + d) % array.length];
        }
        return leftRotatedArray;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 2;
        int[] rotatedArray = rotateLeft(array, d);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
