package ExceptionHandling;

public class MethodStack {

    public static void main(String[] args) {

        MethodStack obj = new MethodStack();
        obj.test1();
    }

    void test1(){
        System.out.println("Test 1 method ");
        test2();
    }
    void test2(){
        System.out.println("Test 2 method ");
        test3();
    }
    void test3(){
        System.out.println("Test 3 method ");
    }
}
