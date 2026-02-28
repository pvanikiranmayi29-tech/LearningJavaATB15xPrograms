package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab235_LL_List {
    //LinkedList is another concept of List
    //It is created to solve the problem of arraylist
    //adding and deleting element in LL is easy
    //but at the same time accessing element is difficult
    //here we use doubly linked list
    //where each element is treated as a node
    //and every node will have the cuurent element
    //and will also have a reference with the prev and next element

    public static void main(String[] args) {
        List mylist = new ArrayList();
        List mylist2 = new LinkedList();

        //both are similar
        //almost all functions are same like add, get, sort ....

        mylist2.add(1);
        mylist2.add(2);
        mylist2.add(3);
        mylist2.add(4);
        mylist2.add(4);
        System.out.println(mylist2);

    }
}
