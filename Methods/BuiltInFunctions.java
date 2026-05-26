package Methods;

public class BuiltInFunctions {
    public static void main(String[] args) {
        // String functions
        String str = "Hello, World!";
        System.out.println("Length of string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // Math functions
        double num = -5.5;
        System.out.println("Absolute value: " + Math.abs(num));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("cube root: " + Math.cbrt(27));
        System.out.println("value of pi: " + Math.PI);
        System.out.println("value of e: " + Math.E);
        System.out.println("Round 3.7: " + Math.round(3.7));
        System.out.println("Ceil 3.2: " + Math.ceil(3.2));
        System.out.println("Floor 3.7: " + Math.floor(3.7));
        System.out.println("Power (2^3): " + Math.pow(2, 3));
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));

        // Array functions
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array length: " + arr.length);
    }
}
