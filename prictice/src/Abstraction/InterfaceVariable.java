package Abstraction;

interface MyInterface{

    int a = 10; // must be initialized (public static final by default)


    public static void main(String[] args){
        System.out.println(a);
    }
}

class Demo implements MyInterface {

    void show(){
        System.out.println(a);

        //or using interface name
        //System.out.println("Access using interface name: " +MyInterface.a);


    }
}

public class InterfaceVariable {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.show();
    }
}

