package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCode {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"sara");
        hashMap.put(2,"riya");
        hashMap.put(3,"siya");
        hashMap.put(4,"nia");
        hashMap.put(5,"mira");
        hashMap.put(6,"radha");

        System.out.println(hashMap);

        hashMap.put(3,"saru");
        System.out.println(hashMap);

     //   Iterator<Map.Entry<Integer,String>> iterator = hashMap.entrySet().iterator(); // when we want both iterate both key and value

      //  Iterator<Integer> iterator = hashMap.keySet().iterator(); // when we want key

         Iterator<String> iterator = hashMap.values().iterator(); // when we want to value

        while (iterator.hasNext()){
            //Integer key = iterator.next();
            //System.out.println(key);

            String s = iterator.next();
            System.out.println(s);

           /* HashMap.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " =  " + entry.getValue());*/

            /*if (key > 2){
                System.out.println(key);
            }*/
        }
    }
}
