package ExceptionHandling;

//10 checked exceptions => root cause => why we got that exception => how to fix it?


public class WhyExceptionHandlingIsNeeded {

    public static void main(String[] args) {

        WhyExceptionHandlingIsNeeded obj = new WhyExceptionHandlingIsNeeded();
        obj = null;

        //obj.dummy(); // NPE

        try
        {
          obj.dummy(); //NPE
        }
        catch (Exception e)
        {
            System.out.println("we got an exception.. ");
        }

        System.out.println("Test Line..");

        try
        {
          int a = 100 / 0;
        }
        catch (Exception e)
        {
            System.out.println("we got an another exception..");
        }
    }

    void dummy()
    {
        System.out.println("dummy method of class WhyExceptionHandlingIsNeeded ");
    }
}
