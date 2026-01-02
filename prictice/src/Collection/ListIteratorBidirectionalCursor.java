package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/*Supports forward & backward traversal
* Can add, update, remove elements
* Works only with List, not Set or Map
* More powerful than Iterator*/

public class ListIteratorBidirectionalCursor {

    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        ListIterator lir = list.listIterator();

        System.out.println("Forward Direction Iterator: ");

        while (lir.hasNext()){

           lir.add("D");

            System.out.println(lir.next());
        }


        System.out.println("Backword Direction Iterator: ");

        while (lir.hasPrevious()){

            System.out.println(lir.previous());
        }


    }
}
