package arrays;
// it is used  to traverse through the elements of an array. 
// It can be used only to read the elements of an array, not to modify them. 
// It is also known as the enhanced for loop.
public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
