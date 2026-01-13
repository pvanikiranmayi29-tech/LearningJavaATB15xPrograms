package exam;

/*7) Simple Calculator
Description:
Write a Java program to perform
addition, subtraction, multiplication, or division based on user choice using a switch statement.*/

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc1.nextInt();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter second number");
        int b=sc2.nextInt();

        int c;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a operation : add / sub / mul / div");
        String s;

        if (!sc.hasNextInt())
        {
            switch (s=sc.next())
            {
                case "add":
                    c=a+b;
                    System.out.println("Addition of given numbers is: "+c);
                    break;
                case "sub":
                    c=a-b;
                    System.out.println("Difference of given numbers is: "+c);
                    break;
                case "mul":
                    c=a*b;
                    System.out.println("Multiplication of given numbers is: "+c);
                    break;
                case "div":
                    c=a/b;
                    System.out.println("Division of given numbers is: "+c);
                    break;
                default:
                    System.out.println("Enter a valid operation add / sub / mul / div");
                    break;
            }
        }
        else
        {
            System.out.println("Please enter a valid operation in words");
        }
    }
}
