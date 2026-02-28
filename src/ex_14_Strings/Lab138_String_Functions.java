package ex_14_Strings;

import java.util.Locale;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        char c = 'A';

        System.out.println(c);

        String s1="ABCD";
        System.out.println(s1);
        System.out.println(s1.length()); //o/p is 4 length() count will start from 1 and not 0

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase()); //this is already there - so now new area is not created

        System.out.println(s1.concat("E"));


    }
}
