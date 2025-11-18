
// Interface = refrence type , abstract 100%
// in Interface only method declaration not implementation code

package Abstraction;


//Rule 1.If one abstract class implement one or more interface,
// then it’s not mandatory for that child class to provide method implementation for Abstract method of interface.


interface AAA{
    int a = 10;
    void test();
}

interface BBB extends AAA {

    int add(int a,int b);
}

abstract class InterfaceRule implements BBB {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void test()
    {
        System.out.println("test method");
    }
}

 //Rule 2. If concreate / Non – Abstract class implement one or more interfaces,
// than its mandatory for that child class to provide method implementation of abstract method of interface.

public class Interface implements AAA,BBB {

    @Override
    public void test() {

    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Interface obj = new Interface();
        obj.test();
        //obj.add(10,20);
        System.out.println(obj.add(10,20));


    }
}


