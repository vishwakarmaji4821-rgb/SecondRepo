
//Write a program to find the large of three numbers
/*public class LargerThree {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        if(a>b && a>c)
        {
            System.out.println("A is grater");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is grater");
        }
        else 
        {
            System.out.println("c is grater");
        }
    }
    
}*/
//Another Way Write a program to find the large of three numbers
public class LargerThree{
    public static void main(String[] args) {
        int a=10, b=20, c =30;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is grater");
            }
            else
            {
                 System.out.println("c is Grater");
            }
        }
        else if(b>c)
        {
            System.out.println("b is grater");
        }
        else 
        {
            System.out.println("c is grater");
        }
    }
}
