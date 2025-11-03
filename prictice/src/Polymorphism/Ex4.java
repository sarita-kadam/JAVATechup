package Polymorphism;

public class Ex4 {

    int show(int a , int b){
        return a + b;
    }

    static int show(int a, double c){
        return (int) (a+c);
    }

    double show(double a, int b){
        return a + b;
    }
    static double show(double a , double w){
        return a + w;
    }

    public static void main(String[] args) {

        Ex4 obj = new Ex4();
        obj.show(10,10);

        Ex4 obj1 = new Ex4();
        obj1.show(10,1000.0);

        Ex4 obj2 = new Ex4();
        obj2.show(2000.0,50);

        Ex4 obj3 = new Ex4();
        obj3.show(7000.0, 8000.0);

        System.out.println(obj1.show(10,1000.0));
    }
}

