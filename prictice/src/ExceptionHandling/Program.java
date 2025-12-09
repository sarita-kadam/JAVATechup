package ExceptionHandling;

public class Program {

    public static void main(String[] args) {


        try{
            System.out.println("statement 1");

            int a = 10/0;

            System.out.println("statement 3");

        }
        catch (NullPointerException e){

        }
        catch (ArrayIndexOutOfBoundsException ee){

        }

        System.out.println("statement 4");

    }
}
