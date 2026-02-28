package ex_08_If_Condition;

public class Lab079_If {
    public static void main(String[] args) {
        System.out.println("Enter the age via the CLI option \n");
        System.out.println(Integer.parseInt(args[0]));

        int age = Integer.parseInt(args[0]);

        if(age>18)
        {
            System.out.println("You can Vote!!");
        }
        else
        {
            System.out.println("You can't Vote");
        }
    }
}
