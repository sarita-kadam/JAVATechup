package Polymorphism.Casting;

// Java does not allow automatic downcasting because it is unsafe.

class Parent1{
    void show(){
        System.out.println("parent class");
    }

}
public class Downcasting extends Parent1 {

    @Override
    void show() {
        System.out.println("child class");
    }

    void test(){
        System.out.println(" test method ");
    }

    public static void main(String[] args) {

        Parent1 obj = new Downcasting();
        obj.show();

        Downcasting obj1 = (Downcasting) new Parent1();
        obj1.test();
    }
}
