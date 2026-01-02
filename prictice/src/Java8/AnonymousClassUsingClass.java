package Java8;

abstract class TestAbstract{

    abstract void show();

    abstract void display();
}

public class AnonymousClassUsingClass {

    public static void main(String[] args) {

       TestAbstract obj = new TestAbstract() {
           @Override
           void show() {

           }

           @Override
           void display() {

           }
       } ;

    }
}
