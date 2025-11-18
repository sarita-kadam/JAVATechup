package Polymorphism;


class test {

    void show(String s){
        System.out.println("String method");
    }

    void show(Object o){
        System.out.println("object method");
    }
}

public class OverloadingExample {

    public static void main(String[] args) {

        test obj = new test();
        obj.show('A');
        //obj.show("saru");

    }
}
