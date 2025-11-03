package Polymorphism;

// A method declared static cannot be overridden but can be re-declared.(method hiding)

class Static{

    void show(){
        System.out.println("default method");
    }

    static void show(int a){
        System.out.println("static method");
    }
}

public class OverridenRule6 extends Static{

    @Override
    void show() {
        System.out.println(1);
    }

    static void show(int a){
        System.out.println("can not override but can method hidding");
    }

    public static void main(String[] args) {

        OverridenRule6 obj = new OverridenRule6();
        obj.show(10);

//        Static obj1 = new OverridenRule6();     ( upcasting)
//        obj1.show(79);

    }
}
