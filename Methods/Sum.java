package Methods;
import java.util.Scanner;
public class Sum {
    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        sum(num1, num2);
        
        sc.close();
    }
}
