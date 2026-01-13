package Polymorphism;

class Example{

    private void show(){
        System.out.println("private method...");
    }

    void dummy(){
        System.out.println("Default method...");
    }

    protected void test(){
        System.out.println("protected method...");
    }

    public void add(){
        System.out.println("public method...");
    }

    static void demo(){
        System.out.println("static method...");
    }

    final void multi(){
        System.out.println("final method...");
    }

}

class Example1 extends Example{



    @Override
    void dummy() {      // protected and public also provide

    }

    @Override
    protected void test() { // provide public also

    }

    static void demo(){

    }

    @Override
    public void add() {

    }
}

public class AccessModifers {

    public static void main(String[] args) {

        Example obj = new Example1();
        obj.add();
        obj.multi();
        obj.dummy();
        obj.test();

        Example.demo();



    }
}
