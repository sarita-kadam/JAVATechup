package ExceptionHandling;

public class JavaMultipleCatchUsingPipe {

    public static void main(String[] args) {

        try
        {
            int array[] = null;
            array[10] = 300;
        }
        catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException  e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            int array[] = new int[10];
            array[10] = 30 / 0;
            Class class11 = Class.forName("ExceptionHandling.JavaMultipleCatchUsingPipe");
            JavaMultipleCatchUsingPipe obj = (JavaMultipleCatchUsingPipe) class11.newInstance();

        }

        catch (ArithmeticException  | ClassNotFoundException | InstantiationException | IllegalAccessException  e)
        {
            System.out.println(e.getMessage());
        }
    }
}






