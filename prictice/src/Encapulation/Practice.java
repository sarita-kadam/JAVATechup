package Encapulation;


class A {

    void show(){
        System.out.println("heyy java");
    }
}

class B extends A{

    @Override
    void show() {
        System.out.println("python");
    }
}
public class Practice {

    public static void main(String[] args) {

        A a = new B(); // upcasting
        a.show();

        B b = (B) a;

        //System.out.println(a);
    }


}
