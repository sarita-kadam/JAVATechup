package Inheritance;

//We use inheritance in Java because it allows us to create new classes that reuse, extend, and modify the behavior defined in other classes.

class Parent{

    int age = 10;
    void test()
    {
        System.out.println("test");
    }
}

class Parent2{
    int b = 20;
    void show()
    {
        System.out.println("show");
    }
}

class Parent3{
    int c = 100;
    void method(){

        System.out.println(c);
    }
}

public class Inheritanceuse extends Parent3{

    public static void main(String[] args) {

        Parent3 obj = new Parent3();
        obj.method();

        Inheritanceuse obj2 = new Inheritanceuse();

        System.out.println(+obj2.c);




    }

}