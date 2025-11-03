package Polymorphism.Casting;

class Parent{
    void show(){
        System.out.println("parent class method");
    }
}

public class CastingOvrriding extends Parent {

    @Override
    void show() {
        System.out.println("child class method");
    }

}
class Testcasting {
    public static void main(String[] args) {


    Parent obj2 = new CastingOvrriding();
    obj2.show(); // object type decide => runtime

       /* Parent obj = new Parent();
        obj.show();

        CastingOvrriding obj1 = new CastingOvrriding();
        obj1.show();*/


}
}
