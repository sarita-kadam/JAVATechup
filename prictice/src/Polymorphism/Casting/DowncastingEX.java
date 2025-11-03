package Polymorphism.Casting;

class A{
    void show(){
        System.out.println("parent class");
    }
}
class B extends A  {
    @Override
    void show() {
        System.out.println("child class");
    }
}

public class DowncastingEX {
    public static void main(String[] args) {
       A obj = new B();  // Child object → Parent reference
       obj.show();


       B obj1 = (B) obj; // Compiletime parent Refrence & Runtime chile object
       obj1.show();


    }
}

