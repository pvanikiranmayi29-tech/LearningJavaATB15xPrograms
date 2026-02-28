package ex_32_CF_02_SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab242_HS {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet();
        s1.add(9);
        s1.add(3);
        s1.add(1);

        System.out.println("Set elements: " +s1);

        Iterator iterator = s1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
