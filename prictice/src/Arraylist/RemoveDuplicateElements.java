package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1); // 1
        al.add(12);
        al.add(11);
        al.add(13);
        al.add(15);
        al.add(88);
        al.add(1); // 1
        al.add(2); //2
        al.add(2); //2
        al.add(13);
        al.add(11);
        al.add(30);
        al.add(15);

        System.out.println(al);

        Set<Integer> hs = new HashSet<>(al);

        System.out.println(hs);

    }
}
