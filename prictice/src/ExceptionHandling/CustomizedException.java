package ExceptionHandling;


class UderAgeException extends Exception //unchecked exception : extend RuntimeException
{
    UderAgeException() {
        super("you are under age");
    }

    UderAgeException(String message) {
     super(message); // provide super to call parent constructor
    }
}

public class CustomizedException {

    public static void main(String[] args)  {

//        int age = 21;
//
//        if(age < 18)
//        {
//           throw new UderAgeException();
//        }
//        else
//        {
//            System.out.println("you can vote");
//        }


        int age = 12;

        try {
            if (age < 18) {

                throw new UderAgeException("you cannot vote as your age is below 18");
            }

            else {
                System.out.println("you can vote");
            }
        }
        catch (UderAgeException e) {

            e.printStackTrace();
        }
        System.out.println("hello");
    }
}