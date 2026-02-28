package ex_31_CF_01_LIST;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(3);
        list.add(3); //arraylist also allows duplicates unlike arrays
        list.add("Vani");
        list.add(true); //arraylist we can add any datatypa
        //here all elements are treated as objects
        //arraylist will not have any size mentioned
        //it grows as we add
        //by default it will always create 10 - default capacity
        //the moment we enter 9 elements and we keep on adding - the capacity is increased to 20 default
        //all this is managed by JVM in the backend
        //arraylist is fast to access the element
        //but slow to insert or delete like array
        //the datatype taken is generally non-primitive datatypes which is wrapper class Integer, String...

        System.out.println(list.size());
        System.out.println(list.lastIndexOf(true));
        System.out.println("ArrayList is Empty: "+ list.isEmpty());
        System.out.println(list.contains(4));
        System.out.println(list.contains("Vani"));
        System.out.println(list.get(list.size()-2)); //this will return the last but 1 element "Vani"
        System.out.println("reverse list is: " +list.reversed());
        System.out.println("original list: "+list);

        System.out.println("------------------");
        //way 1 to iterate over arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------");
        //way 2 to iterate over arraylist - for each loop
        for (Object o:list)
        {
            System.out.println(o);
        }
        System.out.println("-----------------");
        //way 3 to iterate over arraylist - for each loop
        //we have a iterator interface for List
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
