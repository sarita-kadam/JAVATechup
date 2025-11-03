package ExceptionHandling;

public class ExceptionStackTrace {

    public static void main(String[] args) {

        ExceptionStackTrace obj = new ExceptionStackTrace();
        obj.test2();
    }

    void test1(){
        ExceptionTest anotherclass = new ExceptionTest();
        anotherclass.dummy();
        System.out.println("This is test2 method of ExceptionStackTrace class");
    }
    void test2(){
        System.out.println("This is test2 method ");
        test1();
    }
}

class ExceptionTest{

    void dummy(){
        int a = 100 / 0;
        show();
        System.out.println("Dummy method of ExceptionTest class");
    }
    void show(){
        System.out.println("What will happen this code");
    }
}