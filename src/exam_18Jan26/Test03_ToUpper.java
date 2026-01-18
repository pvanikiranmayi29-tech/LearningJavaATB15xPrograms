package exam_18Jan26;

/*Program Name: Convert String to Uppercase
Description:
Write a Java program to convert a given string into uppercase and print the result.*/

import java.util.Scanner;

public class Test03_ToUpper {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.next();

        System.out.println("UpperCase of given string: "+input.toUpperCase());

        //without using in-built function
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = lower.indexOf(ch);

            if (index != -1) {
                result = result + upper.charAt(index);
            } else {
                result = result + ch;
            }
        }

        System.out.println("W/O function - Uppercase string: " + result);
    }
}
