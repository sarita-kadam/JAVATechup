package ExceptionHandling;

public class StackOverFlow {

    public static void main(String[] args) {

        test1();
    }

   static void test1(){
        test2();
    }
   static void test2(){
        test3();
    }

   static void test3(){
        test4();
    }

    static void test4(){
        try{
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

    }



//catch (Exception e) {
//            e.printStackTrace();  // Prints full details of the error
//        }