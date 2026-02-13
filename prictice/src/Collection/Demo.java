package Collection;

public class Demo {

    public static void main(String[] args) {
        Integer a = 120;
        Integer b = 120;
        Integer c = 177;
        Integer d = 129;
        System.out.println(a==b); // 140==140
        System.out.println(b==c); // 140==177
        System.out.println(b==d); // 140==129
        System.out.println(c==d); // 177==129
    }
}
