package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {

    //You need to take a user input and ask for integer from 1 to 7
    //And if user enters 1 to 7
    //you will tell which day it is

    //Logic Building formulae

    //Step1 - Number one is using the Scanner class
    //Step2 - number two will be basically figuring out the expression and the day
    //Step3 - we will basically add step3 as a rough logic
    //Step4 - 4 we will write and fix the logic and optimize
    //Step5 - figure out the edge cases
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");

        //int day=scanner.nextInt();

        if(scanner.hasNextInt())
        {
            int day=scanner.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Mon");
                    break; //if this is not used and user enters 1 as input all the values will be printed
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Please enter a valid number from 1 to 7");
                    break;
            }
        }
        else
        {
            System.out.println("Enter a valid input - integer");
        }
    }


}
