package JavaBasic;
//Autoboxing : primitive → wrapper
//Unboxing   : wrapper   → primitive
// Vice-Versa: You can convert int to Integer, and Integer to int → vice-versa



public class WrapperClass {

    public static void main(String[] args) {

       Integer b = 1;
       Integer c = 1;

       int x = 2;
       int y = 2;

        System.out.println(x==y);// true
        System.out.println(b==c);
        System.out.println(b==x);
    }

}
