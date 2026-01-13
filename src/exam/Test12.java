package exam;

/*12) Break Statement Example
Description:
Write a Java program to print numbers from 1 to 10,
but stop the loop when the number becomes 5 using the break statement.*/

public class Test12 {
    public static void main(String[] args)
    {
        for (int i=0;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
