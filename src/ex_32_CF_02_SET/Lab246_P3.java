package ex_32_CF_02_SET;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab246_P3 {
    public static void main(String[] args) {
        Map m1 = new HashMap(); //if we do not specify the datatype we can use generic - any datatype as below
        m1.put("name","Pramod");
        m1.put("rollno",1);
        m1.put("phone","987654321");
        System.out.println(m1); //the o/p will be random
        //eg o/p {phone=987654321, name=Pramod, rollno=1}

        Map m2 = new LinkedHashMap();
        m2.put("name","Pramod");
        m2.put("rollno",1);
        m2.put("phone","987654321");
        System.out.println(m2); //the o/p will be as per user input
        //o/p {name=Pramod, rollno=1, phone=987654321}

        Map m3 = new TreeMap();
        m3.put("name","Pramod");
        m3.put("rollno",1);
        m3.put("phone","987654321");
        System.out.println(m3); //the o/p will be natural sorted order (sort alphabetically on Key)
        //o/p {name=Pramod, phone=987654321, rollno=1}
    }
}
