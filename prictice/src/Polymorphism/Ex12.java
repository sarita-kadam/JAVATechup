package Polymorphism;


class W {
    int show(int i) {
        return i *= i;
    }
}

class M extends W{
    double show(double d){
        return d /= d;
    }
}

class H extends M {

    float show(float f){
        return f += f;
    }
}
public class Ex12 {
    public static void main(String[] args) {
        H obj = new H();
        System.out.println(obj.show(12.99));
    }
}
