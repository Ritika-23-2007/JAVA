import java.util.Scanner;
public class Square {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nummber for squaring : ");
        double num1 = sc.nextInt();
        double square = num1*num1;
        System.out.print("The square of  " + num1 + "  is :  " + square);
        sc.close();
    }
}