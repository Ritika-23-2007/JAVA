public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int num1 = 10;
        double num2 = num1; // int is automatically converted to double
        System.out.println("Original integer value: " + num1);
        System.out.println("Implicit type casting (int to double): " + num2);

        // Explicit type casting (narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double is explicitly cast to int
        System.out.println("Original double value: " + num3);
        System.out.println("Explicit type casting (double to int): " + num4);

        // Type casting from  char to int 
        char letter = 'A';
        int asciiValue = letter; // char is automatically converted to int (ASCII value)
        System.out.println("Original char value: " + letter);
        System.out.println("Implicit type casting (char to int): " + asciiValue);

        // Type casting from int to char
        int num5 = 66;
        char letter2 = (char) num5; // int is explicitly cast to char
        System.out.println("Original int value: " + num5);
        System.out.println("Explicit type casting (int to char): " + letter2);

        

    }
}
