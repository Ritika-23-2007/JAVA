package if_else;
import java.util.Scanner;
public class GreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input for three numbers
        System.out.print("Enter the first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number c : ");
        int c = sc.nextInt();

        String greatest;

        //comparing the three numbers to find the greatest
       if (a==b && a==c) { greatest = "All are equal."; }
       else if(a==b && a>c) { greatest = "a and b both are equal and greateer than c.";}
       else if(a==b && c>a) { greatest = "c is greatest.";}
       else if(b==c && a>c) { greatest = "a is greatest.";}
       else if(b==c && c>a) { greatest = "b and c both are equal and greateer than a.";}
       else if(a==c && a>b) { greatest = "a and c both are equal and greateer than b.";}
       else if(a==c && b>c) { greatest = "b is greatest.";}
       else if (a>b && a>c) { greatest = "a is greatest.";}
       else if (b>a && b>c) { greatest = " b is greatest.";}
       else { greatest = "c is greatest.";}
       

        //printing the greatest number
        System.out.println(greatest);
        sc.close();
    }
}
