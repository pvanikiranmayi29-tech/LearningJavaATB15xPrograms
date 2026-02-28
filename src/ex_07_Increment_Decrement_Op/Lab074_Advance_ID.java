package ex_07_Increment_Decrement_Op;

public class Lab074_Advance_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        //divide and result
        //a++ - first assign and then increment
        //A -> a++ -> 10 first it is assigned
        //+
        //B -> a -> 11 - then incremented
        //10+11 = 21

        //ERT table
        //Lno | a | Exp(print)
        //5 | 10 | NA
        //6 | 10 | 21
    }
}
