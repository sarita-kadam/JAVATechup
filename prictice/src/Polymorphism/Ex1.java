package Polymorphism;


class AA {

}
class BB extends AA{

}
class CC extends BB{

}
public class Ex1 {
    static void overloaded(AA a){
        System.out.println("one");
    }
    static void overloaded(BB b){
        System.out.println("Two");
    }
    static void overloaded(CC c){
        System.out.println("Three");
    }

    public static void main(String[] args) {
        CC c = new CC ();

        overloaded(c);
    }

}
