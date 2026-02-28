package ex_32_CF_02_SET;

import java.util.Hashtable;

public class Lab251_HashTable {
    public static void main(String[] args) {
        //Map - K-V pair, null value allowed
        //HashTable - Synchronized and slow, and this is a legacy class - thread safe
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        /*ht1.put(4,null);
        ht1.put(null,"test");*/ //null is key or value - both will give exception in HashTable
    }
}
