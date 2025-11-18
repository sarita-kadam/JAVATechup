package ExceptionHandling;

//System.exit(int status) Method

public class SystemExistMethod {

    public static void main(String[] args) {

        try {
            int a = 10 , b = 0;
            int c = a / b;
            System.out.println("Inside try");
        }
        catch (Exception e) {
            System.out.println("catch block executed");
            System.exit(0);
        }
        finally {
            System.out.println("Finally block");
        }
    }
}

