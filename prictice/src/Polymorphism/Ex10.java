package Polymorphism;

// final methods can be overridden but can’t be overloaded? True or False?

public class Ex10 {

    void show(){
        System.out.println("Default method");
    }

    final void show(int a){
        System.out.println("final method can be overloaded because of parameter");
    }
}
