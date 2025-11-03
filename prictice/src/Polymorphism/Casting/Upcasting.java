package Polymorphism.Casting;

class Upcastingparent{

    void show(){
        System.out.println("casting");
    }
}

public class Upcasting extends Upcastingparent {

    public static void main(String[] args) {

        Upcastingparent obj = new Upcasting();  // upcasting
        obj.show();

       // Upcasting obj2 = (Upcasting) new Upcastingparent(); // Downcasting (downcasting take runtime error)

        Upcastingparent obj2 = new Upcastingparent();

    }
}
