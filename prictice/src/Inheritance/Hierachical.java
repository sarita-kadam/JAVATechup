
package Inheritance;

 //     ** Hierarchical Inheritance **

//           - more than one subclass is inherited from a single base class
//           - one parent have one or more child


class parent1{
    void show(){
        System.out.println("aa");
    }

}

class child1 extends parent1 {
    void test(){
        System.out.println("bb");
    }
}

class Child2 extends parent1{
    void add(){
        System.out.println("cc");
    }
}

class child3 extends parent1{
    void dummy()
    {
        System.out.println("dd");
    }
}
public class Hierachical {

    public static void main(String[] args) {


        child3 obj = new child3();
        obj.show();
        obj.dummy();


        child1 obj1 = new child1();
        obj1.show();
        obj1.test();

        Child2 obj2 = new Child2();
        obj2.show();
        obj2.add();

    }

}
