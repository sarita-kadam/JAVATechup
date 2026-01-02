package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("sara");
        al.add("kadam");
        al.add("rutu");
        al.add(11);
        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add(2);
        al1.add(11);
        al1.add("sara");
        al1.add(20);
        al1.add("kadam");
        System.out.println(al1);

        //1.removeAll(); = Method delete All common values in two ArrayList
       al.removeAll(al1);
       System.out.println(al);

        // 2. indexOf():- Method get this value on which index position
        // suppose this value is not present then it will give -1
        System.out.println(al1.indexOf("sara"));

        // 3. contains():- Method is used to check contain present or ot in the ArrayList
        // it's present then it will return true else false
        System.out.println(al1.contains("kadam"));

        // 4. remove():- remove Element in ArrayList But We don't know Index Nummber..
        al1.remove(3);
        System.out.println(al1);
        System.out.println(al.remove(String.valueOf("kadam")));

        // 5. add(index,Element) :- this method add element which index
        al.add(0, "sarita");
        System.out.println(al);

        // 7. clear() :- this method clear the all data in ArrayList.
        // al.clear();
        // System.out.println(al);


        // 8. clone() :- this is create duplicate object with element
        al.clone();
        // System.out.println(al);

        // 9. contains():- this method check this elements present another Arraylist or not
        System.out.println(al.contains("saru"));

        // 10. equals():- this methos will check two Objects Elements are Equals or Not.
        System.out.println(al.equals(al1));

        // 11. get(index):- this method will get index value
        System.out.println(al.get(1));

        // 12. getClass():- this will return which class to belongs.
        System.out.println(al.getClass());

        // 13. al.add(Element) :-this method return boolean value suppose in this method can
        // we add this element can add the it will return true else false
        System.out.println(al.add("Avi"));

        // 14. size():- this method will return how many Objects are present in this Colletion
        System.out.println(al.size());

        // 15. isEmpty():- This method return this Arraylist is Empty then true else false
        System.out.println(al.isEmpty());

        // 16. set(index,Element):- this method update The This index value
        al.set(2, "Pune");
        System.out.println(al);

        Iterator iterator = al.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
