package ex_31_CF_01_LIST;


import java.util.*;

public class Lab233_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        //List marks_sortedD = new ArrayList();
        marks.add(91);
        marks.add(97);
        marks.add(85);
        marks.add(79);
        marks.add(56);
        marks.add(88);

        //System.out.println(marks);
        //Collections.sort(marks) will sort in descending order by default
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println(marks.reversed());

    }
}
