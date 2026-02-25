package ExceptionHandling;

public class Example {

    public static void main(String[] args) {

       /* try{
            System.out.println("Code is start");
            int a = 10;
            int b = 0;
            int c = a /b;
            System.out.println(c);
            System.out.println("it will run or not");
        }
        catch (ArithmeticException e ){
            e.printStackTrace();
        }
        finally {
            System.out.println("Code is stop");
        }*/


        /*try{
            int a = 10/0;
        }finally {
            System.out.println("unhandled exception");
        }
*/

        //Multi-catch exception rules

        /*try{
            int b = 10 / 0 ;
        } catch (Exception | ArithmeticException e) { // this line give you compile time error because of ArithmeticException is child of Exception.

            e.printStackTrace();

        }*/


        //What Happens If finally Throws Exception?

        try{
            throw new RuntimeException("try Execute");
        }finally {
            throw new RuntimeException("finally Execute");
        }
    }
}
