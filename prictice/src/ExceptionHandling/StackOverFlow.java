package ExceptionHandling;

public class StackOverFlow {

    public static void main(String[] args) {

        StackOverFlow obj = new StackOverFlow();
        obj.test1();
    }
    void test1(){
        test2();
    }
    void test2(){
        test1();
    }
}


//catch (Exception e) {
//            e.printStackTrace();  // Prints full details of the error
//        }