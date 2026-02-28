package ex_32_CF_02_SET;

import java.util.*;

public class Lab241_SET_HS_LHS_TS {
    //Set is a interface
    //and it has 4 classes out of 3 are widely used
    //HashSet, LinkedHashSet, TreeSet and EnumerationSet(generally not used in automation)
    //set is also a part of collection framework
    //difference between set and list is list allows duplicates and set will not allow duplicates

    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        //For all there types of sets hashing is the mechanism - which is executed in the backend by JVM
        //for simple example it is like a aadhar for an individual

        //HashSet will store the values in random order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        System.out.println(hs); //here since the watermelon is duplicated - we will have only one entry

        //hs.add(123); //since we have given Set<String> we cannot give integer values\
        hs.add(null); //one null is allowed in HashSet
        //hs.add(null); //two nulls are not allowed
        System.out.println(hs); //o/p is [null, Apple, Watermelon, Orange] and this can change as it is random

        //LinkedHashSet is similar to LinkedList
        //Only difference is duplicates are not allowed
        //the values are stored with the reference to prev and next
        //likedhashset is stored in user input order
        Set lhs = new LinkedHashSet();
        lhs.add("Dapple");
        lhs.add("Apple");
        lhs.add("apple"); //here Apple and apple are not same/duplicate as the case is diff
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs); //o/p : [Dapple, Apple, Orange, Watermelon, null]
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Orange"));

        System.out.println("-----------------------");

        Set ts = new TreeSet();
        //Black and Red Tree mechanism to store elements
        //Natural sorting order is maintained
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
        System.out.println(ts);
        ts.add(123); //even though we did not mention it to be String
        //we cannot add different datatype as sorting will not happen
        //it will fail


    }
}
