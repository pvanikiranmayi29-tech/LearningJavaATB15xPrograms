package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //A = a++ first assign and increment - A=10 and a=11
        //B = ++a increment and then assign B=12 and a = 12

        //ERT table
        //Lno | a | A | B
        //5 | 10 | NA | NA
        //6 | 12 | 10 | 12  -> 10+12=22
        //7 | 12
    }
}
