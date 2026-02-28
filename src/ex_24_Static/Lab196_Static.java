package ex_24_Static;

public class Lab196_Static {
    public static void main(String[] args) {

        Automation a1 = new Automation();
        System.out.println(a1.driver);
        System.out.println(Automation.driver); //both these statements are same
        Automation.driver="Firefox";
        System.out.println(a1.driver); //we can use automation. or a1. , automation. is suggested
        System.out.println(Automation.driver2); //the o/p will be null as there is no initialization of driver2
        //default value of static is null
    }

}

class Automation{
    static String driver = "Chrome";
    static String driver2;
}