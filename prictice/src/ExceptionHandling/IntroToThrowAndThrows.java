package ExceptionHandling;

public class IntroToThrowAndThrows {

    public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException,ArithmeticException
    {
        IntroToThrowAndThrows obj = new IntroToThrowAndThrows();
        obj.div(100,10);
    }

    void div(int a , int b) throws ClassNotFoundException,InstantiationException,IllegalAccessException,ArithmeticException
    {
        if (b == 0)
        {
            throw new ClassNotFoundException(" value of variable b is 0 and that's what causing this issue");

            /*throw new NullPointerException(" value of variable b is 0 and that's what causing this issue ");*/
        }

        if (a == b)
        {
          throw new NullPointerException("value of variable b is 0 and that's what causing this issue");

        }

        int c = a / b;
        System.out.println("Div is " + c);

        Class obj = Class.forName("ExceptionHandling.IntroToThrowAndThrows");

        IntroToThrowAndThrows obj1 = (IntroToThrowAndThrows) obj.newInstance();

        /*try{
            int c = a / b;
            System.out.println("Div is " + c);
        }
        catch (RuntimeException e) {

        }*/
    }

    void test(){
        System.out.println("Test Method");
    }
}
