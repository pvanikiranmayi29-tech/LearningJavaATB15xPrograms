/*Program Name: Count Characters in a String
Description:
Write a Java program to count the total number of characters in a given string (excluding spaces).*/

package exam_18Jan26;

import java.util.Scanner;

public class Test01_CharCount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();

        System.out.println("The total number of char in given string is: "+input.length());

        int count=0;

        for (int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i)!=' ')
            {
                count=count+1;
            }
        }
        System.out.println("W/O function use - The total number of char(excluding space) in given string is: "+count);
    }
}
