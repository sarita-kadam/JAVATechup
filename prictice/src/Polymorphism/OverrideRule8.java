package Polymorphism;
// A subclass within the same package as the instance’s superclass can override
//any superclass method that is not declared private or final or static.

class Overridemethod {
    void test(){
        System.out.println("parent class");
    }

    private void show(){
        System.out.println("private method"); // can not override
    }

    final void display(){
        System.out.println("final method"); // can not override
    }

    static void add(){
        System.out.println("static method"); // can not override but we can hide this method
    }
}

class Child extends Overridemethod{

    @Override
    void test() {
        super.test();
    }
    static void add(){
        System.out.println("method hidding");
    }


    //void show() "private" method can not be override
    //void display() "final" method can not be override
    //void add() "static" method can not be override but hide
}
public class OverrideRule8 {
    public static void main(String[] args) {

        Overridemethod obj = new Overridemethod();
        obj.test();
        //obj.show(); private method can not be override
        obj.display(); // static method can not be override but hide method


        Child obj1 = new Child();
        obj1.test();
    }
}

// public / protected / default (package-private)
// private / final / static