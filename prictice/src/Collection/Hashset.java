package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Hashset {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("saru");
        al.add("riya");
        al.add("sara");

        HashSet hashset = new HashSet();
        hashset.addAll(al);
        hashset.add(20);
        hashset.add(10);
        hashset.add(40);

        //hashset.clear();

        hashset.remove("sara");

      //  System.out.println(hashset.contains("saraa"));

        System.out.println(hashset);


        /*hashset.add(10);
        hashset.add("saru");
        hashset.add('a');
        hashset.add(null);
        hashset.add(null);
        hashset.add("java");
        hashset.add(10);
*/
       /* hashset.add(30);
        hashset.add(20);
        hashset.add(10);
        hashset.add(40);

        System.out.println(hashset);

        Iterator itr = hashset.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }
*/

    }
}
