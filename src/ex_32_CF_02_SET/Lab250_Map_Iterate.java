package ex_32_CF_02_SET;

import java.util.HashMap;
import java.util.Map;

public class Lab250_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put(null,120); //hashmap and linkedhashmap is allowed, treemap this is not allowed

        System.out.println(map);

        for(Map.Entry<String,Integer> item: map.entrySet()){
            /*System.out.println(item.getKey());
            System.out.println(item.getValue());*/

            System.out.println(item.getKey() +" - "+ item.getValue());
        }
    }
}
