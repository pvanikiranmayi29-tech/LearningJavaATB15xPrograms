package exam;

/*5) Positive, Negative or Zero

Description:
Write a Java program to check whether a given number is
positive, negative, or zero using the ternary operator.*/

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        String res= num>0 ? "Positive" : num<0 ? "Negative" : "zero";

        System.out.println("The entered number is: "+res);
    }
}
