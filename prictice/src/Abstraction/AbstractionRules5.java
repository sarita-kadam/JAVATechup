package Abstraction;

/* Rule.5 If create Non – Abstract class “extends” Abstract class,Then it’s mandatory for that child class to provide
method implementation of abstract method of super class.*/



abstract class CC {

    void test(){
        System.out.println("Non-Abstract Method");
    }


    abstract void show();


}

public  class AbstractionRules5 extends CC{

    @Override
    void show() {
        System.out.println("Implimentation asbtract  method");
    }
}


