package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationLegacyCursor {

    public static void main(String[] args) {

        Vector v = new Vector();


        for(int i = 0; i <= 5; i++){

            v.addElement(i);
        }

        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()){

            System.out.println(e.nextElement());
        }
    }
}
