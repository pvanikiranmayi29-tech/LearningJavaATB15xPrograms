package ex_31_CF_01_LIST;

import java.util.LinkedList;

public class Lab234_LinkedList_example {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.addFirst("Grapes"); //addfirst can be used to add the element at the begining of list
        list.addLast("Kiwi");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2)); //Banana
        list.removeFirst(); //it will remove Mango
        list.remove("Banana");

        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Cherry"));
    }
}
