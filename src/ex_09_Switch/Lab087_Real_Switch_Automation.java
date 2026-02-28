package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the browser:");
        String browser = scanner.next();
        //as the swtich is taken for lowercase and if user enters uppercase or camel case - the o/p will be default
        //so we need to convert to lowercase for all inputs
        browser=browser.toLowerCase();

        switch(browser)
        {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("...........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea of this browser");
        }
    }
}
