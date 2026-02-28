package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number a=");
        int a= scanner.nextInt();

        System.out.println("Enter a number b=");
        int b= scanner.nextInt();

        int sum = sum_two_numbers(a,b);
        System.out.println("Sum of number is: "+sum);
    }

    //User-defined functions are of four types
    //1. Without Parameter and without return type
    //2. Without parameter but with return type
    //3. With parameter but without return type // best example Main method
    //4. With parameter and with return type

    //this below function is of 4th type
    static int sum_two_numbers(int x, int y) //user defined function with return type and parameter
    {
        return x+y;
    }
}
