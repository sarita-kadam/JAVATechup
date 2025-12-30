package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class IntroMap {

    public static void main(String[] args) {


        Map map = new HashMap();
        map.put(101, "saru");
        map.put(102, "riya");
        map.put(103, "siya");
        map.put(102, "amit");
        map.put(null, null);
        map.put(null, "sara");

        //map.clear();
        // System.out.println(map.containsKey(100));
        //  System.out.println(map.containsValue("riya"));

        // System.out.println( map.get(102));

        // System.out.println(map.isEmpty());

        // map.remove(102);

        // map.replace(102,"ravi");

        //  System.out.println(map.size());

        System.out.println(map);
    }
}