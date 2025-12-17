package Collection;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(40);
        al.add(50);
        al.add("sara");
        al.add(10);
        al.add(20);

        Iterator itr = al.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }



      //  System.out.println(al.indexOf(10));


        // al.set(1,30);

     //   System.out.println(al.get(2));

      //  System.out.println(al.size());

       // System.out.println(al.contains(100));

/*
        al.add(1,99);

      al.clear();

        //al.remove(3);

        System.out.println(al);

        System.out.println(al.get(2));

        Collections.sort(al);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++){

            System.out.println(al.get(i));
        }
*/

    }
}
