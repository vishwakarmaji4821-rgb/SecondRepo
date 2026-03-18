//Find Even Or Odd Number.
import java.util.Scanner;

public class FindEvenOrOdd {
    public static void main(String[] args) {
         Scanner e= new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = e.nextInt();

        if(n%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    
}
