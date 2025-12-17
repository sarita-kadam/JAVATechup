package Collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector(); // initial capacity 10
        v.addElement("saru");
        v.addElement("riya");
        v.addElement("sara");
        v.addElement("sarita");
        v.addElement("saru");
        v.addElement("riya");
        v.addElement("sara");
        v.addElement("sarita");
        v.addElement("nia");
        v.addElement("reem");
       // v.addElement(20);


        System.out.println(v.capacity());

    }
}
