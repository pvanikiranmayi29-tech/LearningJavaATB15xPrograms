package ex_34_CF_04_MAP;

import java.util.*;

public class Lab245_Map_P2 {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        Map<String,Integer> marks = new HashMap();
        //HashMap is similar to HashSet
        //the back end works on Hashing and order is random i.e., no guaranteed order
        //the functions are different like

        marks.put("Alice",95);  //instead os add in HS we has put function in hashmap
        marks.put("Bob", 82);
        marks.put("Charlie", 90);
        marks.put("Dave",78);

        System.out.println(marks);

        System.out.println(marks.get("Alice")); //for accessing element we use get function
        System.out.println(marks.get("Shravan")); //for this the default value is null
        System.out.println(marks .getOrDefault("Vani",0));
        //getordefault means - if key is available it will print the value
        //if the key is not found it will give default value 0
        //here we can specify the default value which we want

        //update
        marks.put("Bob",88);
        System.out.println(marks.get("Bob"));

        System.out.println(marks.containsKey("Charlie")); //the o/p will be boolean

        System.out.println(marks.size());

        marks.remove("Dave");

        System.out.println(marks);
    }
}
