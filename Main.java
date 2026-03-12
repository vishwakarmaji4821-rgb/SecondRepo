// write a program no for even or odd
/*public class EvenOdd {
    public static void main(String[] args){
        int no=90;
        if(no%2 ==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
}*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number :");
        int no =s.nextInt();
        if(no%2 ==0)
        {
            System.out.println("no is even");
        }
        else{
            System.out.println("no is odd");
        }
    }
}
