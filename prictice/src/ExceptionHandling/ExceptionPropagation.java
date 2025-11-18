package ExceptionHandling;

public class ExceptionPropagation {

    void method1(){
        int data = 20 / 0;
    }

    void method2(){
        method1();
    }
    void method3(){
        try{
            method2();
        }catch(ArithmeticException e){
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String[] args) {

        ExceptionPropagation obj = new ExceptionPropagation();
        obj.method3();
        System.out.println("Normal flow continues...");
    }
}



