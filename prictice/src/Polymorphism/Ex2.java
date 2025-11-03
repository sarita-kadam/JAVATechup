package Polymorphism;

public class Ex2 {

    static void add(int a){
        System.out.println("static method");
    }

    void add(int a , int b){
        System.out.println("non- static method");
    }

    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        obj.add(10);
    }
}
