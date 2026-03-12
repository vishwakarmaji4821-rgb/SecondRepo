// Write a program to user input.
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = s.next();
        System.out.println("Enter Your Age :");
        int age = s.nextInt();
        System.out.println("Enter Your Gender :");
        char gender = s.next().charAt(0);
        System.out.println("Enter Your Phone Number :");
        long phone = s.nextLong();
        System.out.println("..........................................");
        System.out.println("Name :"+name);
        System.out.println("Age"+age);
        System.out.println("Gender"+gender);
        System.out.println("Phone Number :"+phone);
    }
} 
