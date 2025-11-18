package Polymorphism;

class Demo{

    static void show(){
        System.out.println("parent class static method");
    }
}

class Demo1 extends Demo{

    static  void show(){
        System.out.println("child class static method");
    }
}

public class StsticFlowInOverriding {

    public static void main(String[] args) {

        Demo obj = new Demo1();
        obj.show();
    }
}
