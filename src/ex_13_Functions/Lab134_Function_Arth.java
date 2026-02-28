package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=readInt(scanner, "Enter the num1: ");
        int b=readInt(scanner, "Enter the num2: ");
        int c=readInt(scanner, "Enter the num3: ");

        /*if (scanner.hasNextInt())
        {
            int c=scanner.nextInt();
        }
        else
        {
            System.out.println("Please enter a int");
        }*/
        //if the method readInt is not created
        //then this code should be written for all 3 numbers

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_div = div(a, b);
        int result_mul = mul(a, b);
        int result_rem = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_div);
        System.out.println(result_mul);
        System.out.println(result_rem);

        scanner.close();
    }

    static int readInt(Scanner scanner, String prompt) { //instead of writng the same code multiple times - we
        //can create a function and use it n number of times
        System.out.println(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else
        {
            System.out.println("Enter the int only");
            return 0;
        }
    }

    static int sum(int a, int b) //4th type of function
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int div(int a, int b) throws ArithmeticException
    {
        if (b==0)
        {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a/b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
}
