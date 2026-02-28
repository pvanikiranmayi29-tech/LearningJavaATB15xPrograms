package ex_29_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab224 {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum("Vani","Shravan");
        temp_sum(3.14,2.45);

        //in real world automation we use list and arraylist in similar way
        //generally arraylist is defined as List mylist = new ArrayList();
        //this is generic way
        //we can also make it similar to array where it will accept only one datatype
        //like

        List<String> mylist = new ArrayList();
        mylist.add("Vani");
        mylist.add("Shravan");
        //mylist.add(123); //this cannot be given as we have changed the generic list to String list
        System.out.println(mylist);
    }

    //if we specify the method like static void temp_sum(Integer a, Integer b)
    //here we can only pass Int values and can never pass String or double or ....
    //So to fix this - we can use generic methods
    //Generic is a static method which is a kind of general method
    //where we can create a method to take any kind of data type
    //here <T> means any datatype
    //T a, T b are same datatype variables passed
    //we can use anything instead of T
    static <T> T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
