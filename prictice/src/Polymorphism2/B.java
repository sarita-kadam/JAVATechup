package Polymorphism2;


import AccessModifer.p1.A;
import Polymorphism1.Rule9;

public class B extends Rule9 {

    @Override
    protected void add() {

        System.out.println("proteced can access same package / diffrent package in subclass(child class)");
    }

    public static void main(String[] args) {

        B obj = new B();
        obj.test();
        obj.add();
       // obj.dummy();  private method can not access other package
        // obj.show();  default can not access other package
       // obj.add();    protected can not access other pakage
    }
}
