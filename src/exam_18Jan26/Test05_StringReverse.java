package exam_18Jan26;

import java.util.Scanner;

public class Test05_StringReverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to print reverse");
        String input= sc.next();
        StringBuilder sb=new StringBuilder(input);

        sb.reverse();

        System.out.println("The reverse of given string is: "+sb);

        //without using in-built function

        String rev="";
        for (int i = input.length()-1; i >=0 ; i--)
        {
            rev=rev+input.charAt(i);
        }
        System.out.println("W/O function - The reverse of given string is: "+rev);
    }
}
