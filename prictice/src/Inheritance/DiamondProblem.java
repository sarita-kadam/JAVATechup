package Inheritance;

//Diamond Problem : It happens when one class gets the same method from
// two different parent classes and does not know which one to use.


class A{
    void show(){
        System.out.println("show method in A class");
    }
}

class B extends A{

    @Override
    void show() {

    }
}

class C extends B{

    @Override
    void show() {

    }
}

class D extends C{

    @Override
    void show() {

    }
}

public class DiamondProblem {

    public static void main(String[] args) {

    }
}
