package ex_31_CF_01_LIST;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        //Vector is similar to arraylist
        //it is an old legacy class
        //and it is threadsafe
        //when something is threadsafe - generally we avoid in Java/automation
        Vector v = new Vector();
        v.add("Vani");
        v.add("Shravan");
        v.add("Test");
        v.add("Anirudh");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Test");
        System.out.println(v);
        System.out.println(v.contains("anirudh"));
    }
}
