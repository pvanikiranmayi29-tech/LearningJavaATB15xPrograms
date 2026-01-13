package exam;

/*2) Even or Odd Number
Description:
Write a Java program to check whether a given number is even or odd using arithmetic operators.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Entered number is a even number: "+a);
        }
        else
        {
            System.out.println("Entered number is an odd number: "+a);
        }
    }
}
