package exam_18Jan26;

/*
Program Name: Compare Two Strings
Description:
Write a Java program to compare two strings and check whether they are equal or not.
*/

import java.util.Scanner;

public class Test04_CompareStrings {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string to compare");
        String str1=sc.next();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter second string to compare");
        String str2=sc1.next();

        boolean b=str1.equalsIgnoreCase(str2);

        System.out.println("The compare result ignoring the case is: "+b);

        //without using in-built functions

        boolean isEqual = true;

        if (str1.length() != str2.length())
        {
            isEqual = false;
        }
        else
        {
            for (int i = 0; i < str1.length(); i++)
            {
                if (str1.charAt(i) != str2.charAt(i))
                {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual)
        {
            System.out.print("The compare result without ignoring the case is:");
            System.out.print("Both strings are equal");
        }
        else
        {
            System.out.print("The compare result without ignoring the case is:");
            System.out.print("Both strings are not equal");
        }
    }
}
