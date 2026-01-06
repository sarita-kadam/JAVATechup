package Arraylist;

import AccessModifer.p1.A;

import java.util.ArrayList;
import java.util.Iterator;

// iteration fast in arraylist(Very fast traversal)
//Non-contiguous Memory ([Prev|Data|Next] -> [Prev|Data|Next] -> [Prev|Data|Next])

public class IteratorProgram {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /*while (itr.hasNext()){

            Integer num = itr.next();

            if (num.equals(2)){
                itr.remove();
            }
        }
        System.out.println(al);*/
    }
}
