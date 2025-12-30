package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class IdentitYHashMap {

    public static void main(String[] args) {

        String s1 = new String("sara");
        String s2 = new String("sara");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println("   ");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Map<String,Integer> map = new HashMap<>();
        map.put(s1,1);
        map.put(s2,2);
        System.out.println(map);
    }
}
