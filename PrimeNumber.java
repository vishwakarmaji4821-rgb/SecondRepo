// write a program to check whether a number is prime or not .
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number you Want :");
        int no =s.nextInt();
        int temp =0;
            for(int i = 2; i <= no/2; i++)        
            {
            if(no%i == 0)
            {
                temp = temp+1;
            }
        }
        if(temp>0)
        {
            System.out.println("not prime");
        }
        else{
            System.out.println("no is prime");
        }
    }
}
