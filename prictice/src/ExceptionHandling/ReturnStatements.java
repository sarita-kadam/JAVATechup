package ExceptionHandling;

public class ReturnStatements {

    public static void main(String[] args) {

        test();
        dummy();
        show();
    }

    //Rule 1: If return is in try block → finally still executes

    public static int test(){

        try{
        return 1;
        }
        finally {
            System.out.println(" 1 finally executed");
        }
    }

    // If return is in catch block → finally still executes

    public static int dummy(){

        try{
            int a = 10/0;
            return 1;
        }
        catch (Exception e) {
            System.out.println(e);
            return 2;
        }
        finally {
            System.out.println(" 2 Finally executed");
        }

    }

    //Rule 3: If finally has a return → it OVERRIDES try/catch return

    public static int show(){

        try{
            int c = 100 / 0;
            return 2;
        }
        catch (Exception e) {
            System.out.println(e);
            return 3;
        }
        finally {
            System.out.println("3 finally block");
            return 4;
        }
    }
}
