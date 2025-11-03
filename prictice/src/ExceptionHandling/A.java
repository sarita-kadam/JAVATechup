package ExceptionHandling;

public class A {

    public static void main(String[] args) {

        try{

            int a=100 , b = 0 ,c;
            c = a/b;
            try{

            }
            finally {
                System.out.println("inner finally block");
            }
        }
        finally {

            System.out.println("outer finally block");
        }
    }
}
