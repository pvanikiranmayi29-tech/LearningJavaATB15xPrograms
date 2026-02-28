package ex_08_If_Condition;

import java.util.Scanner; //this is default imported when we add the scanner input

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {
        //Take input from user from console using scanner

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the age: ");

        int age=scanner.nextInt();
        System.out.println(age);

        if(age>=18)
        {
            System.out.println("Major");
        }
        else
        {
            System.out.println("Minor");
        }
        scanner.close();
    }
}
