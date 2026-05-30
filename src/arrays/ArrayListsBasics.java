package arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsBasics {
    public static void main(String[] args) {

        // ArrayList is a resizable array, which can be found in the java.util package.
        // The ArrayList class provides methods to manipulate the size of the array that is used to store the elements in the list.

        // Creating an ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();

        // Adding elements to the ArrayList
        // The add() method is used to add elements to the ArrayList. 
        // It takes the element as an argument and adds it to the end of the list.
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Printing the complete ArrayList
        System.out.println("Initial ArrayList:");
        System.out.println(list1);

        // Accessing elements in the ArrayList
        System.out.println("Element at index 0:");
        System.out.println(list1.get(0));

        // Modifying elements in the ArrayList
        list1.set(0, 10);
        System.out.println("ArrayList after modification of an element at given index:");
        System.out.println(list1);

        // Removing elements from the ArrayList
        list1.remove(1);
        System.out.println("ArrayList after removal of an element at given index:");
        System.out.println(list1);

        //Adding an element at a specific index
        list1.add(1, 20);
        System.out.println("ArrayList after adding an element at a specific index:");
        System.out.println(list1);

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + list1.size());

        // Sorting the ArrayList
        Collections.sort(list1);
        System.out.println("ArrayList after sorting:");
        System.out.println(list1);

        //Reversing the ArrayList
        Collections.reverse(list1);
        System.out.println("ArrayList after reversing:");
        System.out.println(list1);

        // Clearing the ArrayList
        list1.clear();
        System.out.println("ArrayList after clearing:");
        System.out.println(list1);

    }
}
