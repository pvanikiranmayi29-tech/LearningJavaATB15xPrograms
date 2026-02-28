package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op_Pre {
    public static void main(String[] args) {
        //increment - we will have pre-increment and post-increment
        //pre-increment - value is increment first and then stored into result

        int a = 10;
        int b = ++a; //first value is incremented that means before assigning to b - JVM will increase the value of a and then assign to b

        System.out.println(a);
        System.out.println(b);

        //++a = a+1
        //Exp and Result Table
        //Line No | a | Result b
        //8 | 10 | NA
        //9 | 11 | 11
        //10 | 11 - a
        //11 | 11 - b
    }
}
