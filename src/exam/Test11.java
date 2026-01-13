package exam;

/*11) Reverse a Number
Description:
Write a Java program to reverse a given number using a do-while loop.*/

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        do
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        } while (num != 0);

        System.out.println("Reversed number: " + reverse);
    }
}
