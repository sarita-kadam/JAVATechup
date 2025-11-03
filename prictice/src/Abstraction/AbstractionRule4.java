package Abstraction;

public class AbstractionRule4 {


}


//4.If one abstract class “extends” another abstract class,
// then it’s not mandatory for that child class to provide method implementation of abstract method.

abstract class AA{

    abstract void show();

}

abstract class BB extends AA{
   /* @Override
    void show() {
        System.out.println("implimentation abstract method of parent class");
    }*/
}