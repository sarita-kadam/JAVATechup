package Polymorphism.Casting;

class A{
    void show(){
        System.out.println("parent class");
    }
}
class B extends A  {

    @Override
    void show() {
        System.out.println(" Overridden child class");
    }
}

public class DowncastingEX {

    public static void main(String[] args) {

       A obj = new B();  // Child object → Parent reference
       obj.show();


        B b = (B) obj; // Compiletime parent Refrence & Runtime chile object
        b.show();


    }
}

