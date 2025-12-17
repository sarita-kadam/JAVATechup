package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String[] args) {

        java.util.Set s = new HashSet();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(100);
        s.add(null);
        s.add(null);

        System.out.println(s);

        Iterator iterator = s.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
