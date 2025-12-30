package Arraylist;

import java.util.ArrayList;

public class AccessElements {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("sara");
        al.add("rushi");
        al.add("pune");
        al.add("mumbai");

        System.out.println(al);

        System.out.println("first element " +al.get(0));

        for (Object ob:al){
            System.out.println(al);
            break;
        }
    }
}
