package Java8;

// functional interface contains only one abstract method


import java.util.function.Consumer;

interface A{
    void show();
    void test();
}

@java.lang.FunctionalInterface
interface B{
    void add();

}

public class FunctionalInterface implements B{

    @Override
    public void add() {

    }

    public static void main(String[] args) {


    }
}

