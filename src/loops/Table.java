package loops;
import java.util.Scanner;
public class Table {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the integer  number for table :");
        int num = sc.nextInt();

        //printing table
        int a;
        for(a=1; a<=10; a++) {
            System.out.println(a*num);
        }

        //closing scanner class
        sc.close();
    }
}
