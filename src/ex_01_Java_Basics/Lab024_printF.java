package ex_01_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
        int a=10;
        String s="vani";

        //System.out.println("Value of a is ->" +a); //println - newline
        //System.out.println("Value of a is ->" +a); //print and printf - no new line

        System.out.printf("Value of a is %d",a);

        System.out.printf("Value of s is %s",s);
        //%d - int, byte, long, short, - data types
        //%s - String
        //%f - float, double
        //%b - boolean

        //advantage is you can have multiple values.
        int aa=100;
        int bb=121;

        System.out.println();
        System.out.printf("When you mul aa*bb result is = %d*%d",aa,bb);

        //program asked in interview - which where we need to use printf is

        int table=9;
        System.out.println();
        System.out.printf("%d*1",table,table*1);
    }
}
