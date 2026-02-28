package ex_14_Strings;

import java.util.Scanner;

public class Lab149_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String reverse="";

        for (int i = input.length()-1; i >=0; i--) //0 is included so we need to give length-1
        {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
