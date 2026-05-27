package loops;
import java.util.Scanner;
public class Prime {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //taking input number from user
    System.out.print("Enter a natural number : ");
    int num = sc.nextInt();

    //counting the number of factors of given number
    boolean prime=true;
    for(int factor = 2; factor <= Math.sqrt(num); factor++) {
        if (num%factor==0) {
            prime=false;
        }
    }

    //printing whether number is prime or not
    if (prime==true) {
        System.out.println("The given number is prime.");
    }
    else {
        System.out.println("The given number is not prime.");
    }
    //closing scanner class
    sc.close();
}
}
