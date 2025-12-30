package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "saru");
        map.put(4, "riya");
        map.put(3, "siya");
        map.put(2, "amit");
        map.put(6 ,"ram");
        map.put(9, "sara");

        System.out.println(map);

        Map<Integer,String> Sortedmap = new TreeMap<>(map);
        System.out.println(Sortedmap);



    }
}
