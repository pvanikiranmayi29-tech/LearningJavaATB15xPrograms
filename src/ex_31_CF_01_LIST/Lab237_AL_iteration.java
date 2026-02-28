package ex_31_CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        List<String> mylist2 = new ArrayList<>(); //both are same

        mylist.add("Vani");
        mylist.add("Shravan");
        mylist.add("Anirudh");

        for(String name:mylist){
            System.out.println(name);
        }
    }
}
