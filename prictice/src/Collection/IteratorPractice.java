package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(" Original list" + list);

        for (Integer i : list){
            System.out.println("print all element from list using enhance for loop " + i);
            //list.add(20);    // Throw exception "ConcurrentModificationException"
            // list.remove(2);
        }


                   //OR

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            //System.out.println("print all element from list using iterator " + i);

            if (i.equals(20)) {
                iterator.remove();
                continue;
            }
            System.out.println(i);
        }

    }
}
