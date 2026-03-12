// Write a program to print table.
import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
         String yn;
         do
         {
            Scanner s =new Scanner(System.in);
            System.out.println("Enter Any NO. :");
            int no = s.nextInt();
            System.out.println("..............................");
            for(int i =1; i<=10; i++)
        {
            System.out.println(no +"*"+i+"="+no*i);
        } 
        System.out.println("DO YOU WANT TO CONTINUE (PRESS Y FOR YES AND N FOR NO)");
           yn = s.next();
         }while(yn.equals("y")|| yn.equals("Y"));
    }
}
