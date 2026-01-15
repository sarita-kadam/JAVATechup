package Collection;

import java.util.Collections;
import java.util.LinkedList;

//Data storage : Nodes (data + links)
//Random access : no(slow)
//Insertion / Deletion : Insertion / Deletion
//Memory usage : More (extra pointers)
//use LinkedList for frequent insertions and deletions.

public class Linkedlist {

    public static void main(String[] args) {

     LinkedList li = new LinkedList();
     li.add("saru");
     li.add("rushi");
     li.add("saru");
     li.add(null);
     li.add(22);
     li.add(24.1);

        li.add(44);
        li.add(55);
        li.add(10);
        li.add(22);

        //Collections.sort(li); // explicit

     //System.out.println(li);

        System.out.println(li.get(2));

    }
}
