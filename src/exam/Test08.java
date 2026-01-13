package exam;

/*8) Month Name Finder
Description:
Write a Java program to print the month name based on the month number (1–12) using a switch statement.*/

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for month");

        if(sc.hasNextInt())
        {
            int mon=sc.nextInt();
            switch (mon)
            {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Enter a valid number between 1-12");
                    break;
            }
        }
        else
        {
            System.out.println("Enter a valid integer");
        }
    }
}
