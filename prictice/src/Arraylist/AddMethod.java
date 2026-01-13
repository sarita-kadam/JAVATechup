package Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class AddMethod {

    Object num;
    int n;

    void add(int n) {
        for (int i = 0; i <= n; i++) {
        }
    }

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al.get(0));

        al.add(0,100);

        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));

        System.out.println(al.size());

        //Another Way we can declare ArrayList

       /* Integer[] arr = { 1, 2, 3, 4, 5 };
         List<Integer> a = Arrays.asList(arr);
        System.out.println(a);*/

    }
}