package tasks;

public class Task_28Dec25 {
    public static void main(String[] args) {
        int i=1;

        for(i=1;i<100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz " +i);
            }
            else if(i%5==0)
            {
                System.out.println("Buzz " +i);
            }
            else if(i%3==0)
            {
                System.out.println("Fizz " +i);
            }
            else
            {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
