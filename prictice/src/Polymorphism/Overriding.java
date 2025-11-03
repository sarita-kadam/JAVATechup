package Polymorphism;

//When a subclass provides its own implementation of a method that is already defined in its parent class,


class parent {

    int add(int a,int b){
        return a + b;
    }
}

public class Overriding extends parent{

    @Override                      // use for re-implimentation
    int add(int a, int b) {
        return a + b + 10;
    }
}
