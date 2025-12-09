package ExceptionHandling;

public class Propagation {

    static void m1(){
        int a = 10/0;
    }

    static void m2(){
        m1();
    }

    static void m3(){
        m2();
    }

    public static void main(String[] args) {

        try{
            m3();
        }catch (ArithmeticException e){
            System.out.println("Exception handled in main");
        }
    }
}
