package Inheritance;

//Upcasting : Converting a Child class object into a Parent class reference.
//Happens automatically.


//DownCasting : Converting a Parent reference back to a Child reference.
//Must be done manually.
//it throw ClassCastException if done wrongly.

class Parent1{

    void show(){
        System.out.println("parent show()...");
    }
}

class Child1 extends Parent1{

    @Override
    void show() {
        System.out.println("child show()...");
    }

    void dummy(){
        System.out.println("child dummy()");
    }
}

public class UpcastingDowncasting {

    public static void main(String[] args) {


        Parent1 obj = new Child1(); // upcasting
        obj.show();
       // obj.dummy(); // method access decide to reference type


        Child1 ob =(Child1) new Parent1(); // down casting
        ob.show();
        ob.dummy();
    }
}
