package ex_14_Strings;

import java.util.Scanner;

public class Lab150_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");

        String user_input = scanner.next();

        String reversed_string = "";

        for (int i = user_input.length()-1; i >=0 ; i--)
        {
            reversed_string = reversed_string + user_input.charAt(i);
        }
        System.out.println(reversed_string);

        if (reversed_string.equalsIgnoreCase(user_input))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
