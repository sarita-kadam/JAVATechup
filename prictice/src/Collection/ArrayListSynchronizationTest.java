package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.List;

public class ArrayListSynchronizationTest extends Thread{

    @Override
    public void run() {
        try{
            sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Orange");
        l.add("Banana");

        List<String> sl = Collections.synchronizedList(l);

        Thread t = new Thread();
        synchronized (sl) {

            ListIterator<String> itr = sl.listIterator();

            while (itr.hasNext()) {

                String s = itr.next();
                l.add("pineapple");
                l.add("Guava");
                System.out.println(s);
            }
        }

    }
}
