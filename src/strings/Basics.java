package strings;
public class Basics {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] array = str.toCharArray();
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Lowercase String: " + str.toLowerCase());
        System.out.println("String after replacing 'World' with 'Java': " + str.replace("World", "Java"));
    }
}