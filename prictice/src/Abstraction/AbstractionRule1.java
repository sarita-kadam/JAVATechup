package Abstraction;

//Rule1.It is not mandatory to have abstract method in abstract class.

public class AbstractionRule1  {


    public static void main(String[] args) {

    }
}


abstract class rule1{

    void show(){
        System.out.println("java");   // non-abstract / concreate method with method body
    }

    void main(){
        System.out.println("css");
    }

    abstract void test();   // abstract method with no body because of abstract method does not have body

}
