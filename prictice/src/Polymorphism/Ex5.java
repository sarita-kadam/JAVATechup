package Polymorphism;

class D {
    void show(int a) {
        System.out.println("one");
    }
    void show(double b){
        System.out.println("Two");
    }
}
 class E extends D {

    @Override
    void show(int a) {
        System.out.println("Three");
    }
}
 public class Ex5{

     public static void main(String[] args) {
        // new E ().show(10);
        // E obj =new E();
        // obj.show(2000.0);
         new E ().show(200.0);
     }
 }