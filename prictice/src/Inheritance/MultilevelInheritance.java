package Inheritance;

//   2.  Multilevel Inheritance : Great Grand Parents = Grand Parents = Parent = Child = Grand child


class GreatGrandParents{
    void show(){
        System.out.println("A");
    }

}

class GrandParents extends GreatGrandParents {
    void test()
    {
        System.out.println("B");
    }
}

class parents extends GrandParents{
    void dummy(){
        System.out.println("C");

    }
}

class child extends parents {
    void add(){
        System.out.println("D");
    }
}
public class MultilevelInheritance {

    public static void main(String[] args) {

        child obj = new child();
        obj.show();
        obj.test();
        obj.dummy();
        obj.add();

        parents obj2 = new parents();
        obj2.show();
        obj2.test();
        obj2.dummy();

        // obj2.add();
    }

}
