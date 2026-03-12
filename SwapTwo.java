// Write a program to swap two numbers.
/*public class SwapTwo {
    public static void main(String[] args) {
             int a=10, b=20;
             int c;
             c=a;
             a=b;
             b=c;
             System.out.println("a"+"......."+a);
             System.out.println("b"+"........"+b);
    }
}*/
// Write a program to swap two numbers without using third variable.
public class SwapTwo{
    public static void main(String[] args) {
        int a =10, b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a"+"......"+a);
        System.out.println("b"+"......."+b);
    }
}

