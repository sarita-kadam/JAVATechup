package Polymorphism;

class X {
    void add(int a, int b){
        System.out.println("class X");
    }
}

class Y extends X{
    @Override
    void add(int a, int b) {
        System.out.println("class Y");
    }
}

class Z extends Y {
    @Override
    void add(int a, int b) {
        System.out.println("class z");
    }
}
public class Ex8 {
    public static void main(String[] args) {
        X obj1 = new Y();
        obj1.add(10,20);

        Y obj2 = (Y) obj1;
        obj2.add(1,2);

        Z obj3 =  (Z) obj2;  // runtime error
        //Z obj3 = new Z();
        obj3.add(3,6);
    }
}
