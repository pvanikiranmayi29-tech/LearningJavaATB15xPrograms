package tasks;

public class Task_19Jan26 {
    public static void main(String[] args)
    {
        int rows=6;

        for(int i=1;i<rows;i++)
        {
            for(int s=rows;s>i;s--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
