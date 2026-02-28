package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class LabInterview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        for(Integer o:al){
            System.out.println(6*o);
        }

        Vector v = new Vector();
        v.add("Vani");
        v.add("Shravan");
        v.add("Anirudh");

        Enumeration e = v.elements(); //enumeration is similar to iterator
        //but they are used only with legacy class vector or stack
        //so this not mostly used for automation
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
