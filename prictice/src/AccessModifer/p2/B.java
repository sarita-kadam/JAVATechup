
package AccessModifer.p2;

import AccessModifer.E;
import AccessModifer.p1.A;

class M {
    void test(){
        System.out.println("protected");
    }


}

 class S {


}

public class B extends E {


    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        E ob1 = new E();
        obj.show();

//        B b = new B();
//        b.

    }
}
