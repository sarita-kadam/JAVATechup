package JavaBasic;

public class AnonymousClass {

    int a;
    int b;
    int c;
    int d;

    AnonymousClass(int p,int q){
        a = p;
        b = q;
        int ab = a * b;
        System.out.println("Multiplication of a and b : " + ab);
    }

    void multiply(int x,int y){
        c = x;
        d = y;
        int cd = c * d;
        System.out.println("Multiplication of c and d : " +cd);

    }

    public static void main(String[] args) {

        new AnonymousClass(100,10);

        new AnonymousClass(20,20);
    }
}
