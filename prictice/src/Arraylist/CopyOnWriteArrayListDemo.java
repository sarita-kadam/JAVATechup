package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        List<String> al = new CopyOnWriteArrayList<>();
        al.add("Sara");
        al.add("riya");
        al.add("sarita");
        al.add("kadam");

        System.out.println(al);

        for (String s : al) {
            if (s.equals("riya")){
                al.add("patil");
            }
        }
        System.out.println(al);
    }
}
