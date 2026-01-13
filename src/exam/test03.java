package exam;

/*3) Explicit Type Casting

Description:
Write a Java program to convert a double value into an int using explicit type casting
and print both values.*/

public class test03 {
    public static void main(String[] args)
    {
        double a=20.45;
        int b;

        b=(int)a;

        System.out.println("Double value entered is:" +a);
        System.out.println("Double value converted to int using explicit casting: " +b);
    }
}
