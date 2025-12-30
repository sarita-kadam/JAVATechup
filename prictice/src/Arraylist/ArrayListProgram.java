package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Black");
        al.add("Pink");
        al.add("Red");
        System.out.println(al);

        // get() Method.
        System.out.println(al.get(3));

        // add() Method Which Index.
        al.add(2, "White");
        System.out.println(al);

        al.add(null);
        System.out.println(al);

        // add(index,Object); Method..
        al.add(2, "Saru");
        System.out.println(al);

        // set(index,Object); Method..
        al.set(2, "Sarita");
        System.out.println(al);

        System.out.println(al.isEmpty());

        System.out.println(al.get(3));

        // Reverse ArrayList.
        Object[] s = al.toArray();
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(" " + s[i]);
        }

        // Duplicate Objects

        Object[] dup = al.toArray();
        int count = 0;

        for (int j = 0; j < dup.length - 1; j++) {
            if (dup[j].equals(dup[j + 1])) {
                count++;
            }
        }

        System.out.println(count);

    }

}

