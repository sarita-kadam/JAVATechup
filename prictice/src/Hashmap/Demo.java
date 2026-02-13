package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"java");
        System.out.println(map.get(1));
        map.put(1,"language");
        System.out.println(map.get(1));

        

        System.out.println(map);

    }
}
