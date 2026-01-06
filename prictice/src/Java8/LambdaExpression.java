package Java8;

import java.lang.FunctionalInterface;

//Lambda Expression :A lambda expression is a short and clear way to write anonymous functions (functions without a name).
//Lambda expressions work only with functional interfaces.
//Lambda Expression Syntax : 1.(parameters) -> expression  2. (parameters) -> { statements; }

@FunctionalInterface
interface Test{

    int show(int a , int b);

    default void add() {
        System.out.println("default method in functional interface");
    }

}


public class LambdaExpression implements Test{
    @Override
    public int show(int a, int b) {
        System.out.println("implemented method of functional interface");
        return a + b;
    }

    @Override
    public void add() {
        System.out.println("overridden default method");
    }

    public static void main(String[] args) {

        /*Test t = (a,b) -> {
            return a + b;
        };
        System.out.println(t.show(10,99));*/

        Test t = (int a , int b) -> a +b;
        t.add();

        System.out.println(t.show(10,100));





        }
    }