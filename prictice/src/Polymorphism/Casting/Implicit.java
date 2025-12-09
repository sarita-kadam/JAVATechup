package Polymorphism.Casting;

class Parents {

    void show(){
        System.out.println("Parent show");
    }
}

class Child extends Parents {

    @Override
    void show() {
        System.out.println("overridden method");
    }

    void display(){
        System.out.println("Child display()");
    }
}
public class Implicit {

    public static void main(String[] args) {

        Parents p = new Child();
        p.show();

    }

}
