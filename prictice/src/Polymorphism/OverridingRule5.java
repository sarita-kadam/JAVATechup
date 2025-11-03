package Polymorphism;

//A method declared final cannot be overridden.


class Final {
    void show(){
        System.out.println("default method");
    }

    final void show(int a){
        System.out.println(" final method");
    }
}
public class OverridingRule5 extends Final{

    @Override
    void show() {
        System.out.println(1);
    }
//    final void show(int a){
//
//    }
}
