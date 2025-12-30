package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorHashmap {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"sara");
        hashMap.put(102,"rutu");
        hashMap.put(103,"riya");
        hashMap.put(104,"nia");
        hashMap.put(105,"mira");
        hashMap.put(106,"sita");

        System.out.println(hashMap);


       /* for (Integer value : hashMap.keySet()){
            System.out.println(value);
        }*/


        /*Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/



        /*Iterator<String> iterator = hashMap.values().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/



        /*for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry);
        }
*/

        Iterator<Map.Entry<Integer,String>> entryIterator = hashMap.entrySet().iterator();

        while (entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }
    }

}

