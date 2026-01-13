package exam;

/*13) Continue Statement Example
Description:
Write a Java program to print numbers from 1 to 10,
but skip printing the number 5 using the continue statement.*/

public class Test13 {
    public static void main(String[] args)
    {
        for (int i=0;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
