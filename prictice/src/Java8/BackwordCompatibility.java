package Java8;

interface AAA{
    void test();
    void add();

    default void multiply(){
        System.out.println("default method");
    }

    static void substraction(){
        System.out.println("static method");
    }
}

class AAAimpli implements AAA{

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }

    @Override
    public void multiply() {
        System.out.println("overridden default method");
    }
}

class AAAimpl2 implements AAA {

    @Override
    public void test() {

    }

    @Override
    public void add() {

    }
}
public class BackwordCompatibility implements AAA {
    @Override
    public void test() {

    }

    @Override
    public void add() {

    }


}
