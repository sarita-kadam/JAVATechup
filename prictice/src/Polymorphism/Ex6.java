package Polymorphism;

public class Ex6 {

    double show(double a){
        return a *= a;
    }

    int show(int b){
        return show(b *= b);

    }

    float show(float c){
        return show(c *= c);
    }

    public static void main(String[] args) {

        Ex6 obj = new Ex6 ();

       // System.out.println(main.show(10));

    }
}

// error