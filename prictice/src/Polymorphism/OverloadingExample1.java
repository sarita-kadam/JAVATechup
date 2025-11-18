package Polymorphism;

class test1{

    void show(Object o){
        System.out.println("object method");
    }

    void show(int a){
        System.out.println("int method");
    }
}


public class OverloadingExample1 {

    public static void main(String[] args) {


        test1 obj = new test1();
        obj.show(obj);
    }
}
