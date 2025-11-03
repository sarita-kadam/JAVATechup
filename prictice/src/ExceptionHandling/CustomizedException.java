package ExceptionHandling;


class UderAgeException extends Exception
{
    UderAgeException()
    {
        super("you are under age");
    }

    UderAgeException(String message)
    {
      super(message);
    }
}

public class CustomizedException {

    public static void main(String[] args) throws UderAgeException
    {

        int age = 22;

        if(age < 18)
        {
           throw new UderAgeException();
        }
        else
        {
            System.out.println("you can vote");
        }
    }
}
