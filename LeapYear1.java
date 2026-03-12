// Write a program to check Lear Year 
public class LeapYear1{
    public static void main(String [] args){
        int year =2016;
        if(year%4==0)
        {
              if(year%100 ==0)
              {
                if(year%400 == 0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
              }
              else{
                System.out.println("Leap Year");
              }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}