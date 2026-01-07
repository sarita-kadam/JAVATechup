package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

//List: 1. maintain insertion order

public class List {

    public static void main(String[] args) {


        java.util.List l = new ArrayList();
        l.add(10);
        l.add(1,20);
        l.add(10);
        l.add(null);
        l.add(null);

       System.out.println(l);

     /* Iterator iterator =  l.iterator();

      while (iterator.hasNext()){

          System.out.println(iterator.next());

      }
*/
        ListIterator listIterator = l.listIterator();

        while (listIterator.hasPrevious()){

            System.out.println(listIterator.previous());
        }
    }
}
