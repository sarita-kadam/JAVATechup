package ExceptionHandling;

public class Rethrow {

    public static void main(String[] args) {


        try{
        calculate();
        }catch (ArithmeticException e){
            System.out.println("Handle in main : " + e);
        }

    }

    static void calculate(){

        try{
            int a = 10/0;


        }catch (ArithmeticException e){
            System.out.println("handled in calculate: " + e);
            throw e;
        }

    }
}
