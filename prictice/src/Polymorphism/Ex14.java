package Polymorphism;


class J{
    public J(int a){
        System.out.println((a));

    }
    int B(int a){
        return ++a + --a;
    }
}

class L extends J {
    public L(int a, int b) {
        super(a*b);
        System.out.println((a + " "+ b));
    }

    int B(int a, int b) {
        return B(a * b);
    }
}
public class Ex14 {
    public static void main(String[] args) {
        L obj = new L(11,12);
    }
}
