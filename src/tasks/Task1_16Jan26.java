package tasks;

import java.util.Scanner;

public class Task1_16Jan26 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");

        String s= sc.next();

        String s_rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
            s_rev=s_rev+s.charAt(i);

        }
        System.out.println("The reversed string is: "+s_rev);
    }
}
