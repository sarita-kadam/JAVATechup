package Collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(60);

       /* ts.add("saru");
        ts.add("riya");
        ts.add("nia");
       // ts.add(10);
*/
       /* ts.add(null);
        ts.add(10);*/

        ts.remove(20);
        System.out.println(ts);
    }
}
