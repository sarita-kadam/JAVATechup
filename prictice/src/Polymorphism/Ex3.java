package Polymorphism;

public class Ex3 {

    void method(int a){
        System.out.println(1);
    }
    void method(int[] a){
        System.out.println(2);
    }

    public static void main(String[] args) {
        Ex3 obj = new Ex3();
        obj.method(new int[]{10});
        obj.method(100);
    }
}
