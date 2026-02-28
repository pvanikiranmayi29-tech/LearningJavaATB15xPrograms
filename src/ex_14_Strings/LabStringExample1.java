package ex_14_Strings;

public class LabStringExample1 {
    public static void main(String[] args) {
        String s = "JAVA";

        char c=s.charAt(2);

        System.out.println(s.length()); //this is o/p 4
        System.out.println(c); // but for this o/p is V - as charAt will start from 0 and not 1


    }
}
