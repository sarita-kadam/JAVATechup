package Polymorphism;

class Demo2 {

    void show(){
        System.out.println("instance method in parent class");
    }
}

class Demo3 extends Demo2 {

    void show(){

        System.out.println("Instance method in child class");
    }
}

public class InstatnceFlowInOverrididng {

    public static void main(String[] args) {

        Demo2 obj = new Demo3();
        obj.show();
    }

}
