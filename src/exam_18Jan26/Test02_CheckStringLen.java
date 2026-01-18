/*Program Name: Check String Length
Description:
Write a Java program to check whether the length of a given string
is greater than 10 or not and print the result.*/

package exam_18Jan26;

import java.util.Scanner;

public class Test02_CheckStringLen {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.next();

        if(input.length()>=10)
        {
            System.out.println("The given string is having more than 10 chars");
        }
        else
        {
            System.out.println("The given string is having less than 10 chars");
        }
    }
}
