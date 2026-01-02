package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);

        ListIterator<Integer> listIterator = arraylist.listIterator();

        while (listIterator.hasNext()) {

            Integer num = listIterator.next();

            if (num == 30) {
                listIterator.add(35);
            }
        }
        System.out.println(arraylist);

    }
}
