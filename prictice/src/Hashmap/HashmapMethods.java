package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapMethods {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put(100,"sara");
        hashMap.put(101,"riva");
        hashMap.put(102,"siya");
        hashMap.put(103,"mira");

        System.out.println(hashMap);

      /*  hashMap.put(102,"nia");
        System.out.println(hashMap);

        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()){

            Integer key = iterator.next();

            if(key > 5){
                System.out.println(key);
            }
        }*/

        //This Display in set Format
        Set s = hashMap.entrySet();
        System.out.println(s);

        //Use Iterator
        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Display only keys
        System.out.println(hashMap.keySet());

        //Display only value in hashmap
        System.out.println(hashMap.values());

        // get(); this only value in hashmap
        System.out.println(hashMap.get(1));

        //replace(); replace you put this keys value.
        hashMap.replace(3,"kiya");
        System.out.println(hashMap);

        hashMap.remove(3);
        System.out.println(hashMap);


    }
}
