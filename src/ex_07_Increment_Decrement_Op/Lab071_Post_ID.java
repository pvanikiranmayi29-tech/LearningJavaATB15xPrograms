package ex_07_Increment_Decrement_Op;

public class Lab071_Post_ID {
    public static void main(String[] args) {
        //post increment - print first and then increment

        int a_post = 10;
        int b = a_post++;

        System.out.println(a_post);
        System.out.println(b);

        //ERT
        //LNo | a_post | b
        //7 | 10 | NA
        //8 | 11 | 10 - here for b first a is assigned and then for a the value is incremented
        //10 | 11 - a_post
        //11 | 10 - b
    }
}
