package Assinment;

import java.util.ArrayList;

import  java.util.Collection;

public class Test {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("sara");
        al.add('a');

        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add("sara");
        al1.add(10);
        al1.add('b');

        System.out.println(al1);

        al.addAll(al1);

        System.out.println(al);
    }
}
