package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {
        //For normal array Interger[] arr = new Integer[10];
        //We need to specify the size while initializing - so Fixed Size
        //Different types of data cannot be stored
        //if we use only 1 or 2 size later - wastage of memory
        //insertion and deletion - we need to perform heavy operations

        //for this 1st in collection framework we have LIST
        //for List we need to import java.util.List
        //List has a list.of() method - of method is a static method in List interface
        // used for giving elements
        List fruits = List.of("Orange","Apple","Guava","Mango","Watermelon");
        System.out.println(fruits);

        //for list we cannot create an object as it is an interface
        //so for this we use ArrayList
        //where ArrayList is a class which implements List

        List arraylist = new ArrayList();
        //the advantage of using Arraylist is we can use and add any datatype
        arraylist.add("Vani");
        arraylist.add(123);
        arraylist.add(true);
    }
}
