package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUniversalCursor {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

       // list.add("sarita");
       // System.out.println(list);

        Iterator<String> it = list.iterator();

        while (it.hasNext()){

         String s = it.next();

         if (s.equals("C")){
             it.remove();
          }
        }

        System.out.println(list);

    }
}
