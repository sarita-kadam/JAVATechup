package ExceptionHandling;

public class IntroToCompileTime {

    void show(){

        System.out.println("show method ");
    }

    public static void main(String[] args) {

        IntroToCompileTime obj = null;

        if (obj == null){

            obj = new IntroToCompileTime();
        }
        obj.show();

        try
        {
            Class.forName("ExceptionHandling.IntroToCompileTime");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

    }

}