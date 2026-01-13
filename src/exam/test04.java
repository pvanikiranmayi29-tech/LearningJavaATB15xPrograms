package exam;

/*4) Maximum of Two Numbers
Description:
Write a Java program to find the maximum of two numbers using the ternary operator.*/

import java.util.Scanner;

public class test04 {
    public static void main(String[] args)
    {
        /*int n1=50;
        int n2=32;*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int n1=sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter second number");
        int n2=sc1.nextInt();

        int max= n1>n2? n1: n2;
        System.out.println("Max of two numbers is: "+max);
    }
}
