package Hashmap;

import java.util.*;

public class EmpProgram {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "sara");
        map.put(2, "riya");
        map.put(3, "priya");
        map.put(4, "nia");
        map.put(5, "raju");
        map.put(6, "mau");
        map.put(7, "mira");
        map.put(8, "Ekta");
        map.put(9, "niki");
        map.put(10, "rutu");

        System.out.println(map);

        Set s = map.keySet();
        System.out.println(s);

        Collection c = map.values();
        System.out.println(c);

        Set<Map.Entry<Integer, String>> ent = map.entrySet();
        System.out.println(ent);

    }
}
