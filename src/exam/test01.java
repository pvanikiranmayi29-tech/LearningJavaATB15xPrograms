package exam;
/*1) Arithmetic Operations on Two Numbers
Description:
Write a Java program that takes two integer numbers and prints their sum, difference,
multiplication, division, and remainder.*/

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter second number");
        int b = sc1.nextInt();

        System.out.println("Sum of both numbers is: " +(a+b));
        System.out.println("Difference of both numbers is: " +(a-b));
        System.out.println("Multiplication of both numbers is: " +(a*b));
        System.out.println("Division of both numbers is: " +(a/b));
        System.out.println("Remainder of both numbers is: " +(a%b));
    }
}
