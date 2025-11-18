package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            int a = 100 / 10;

            int[] arr = new int[10];

            arr[19] =100;

            SingleTryMultipleCatch obj = new SingleTryMultipleCatch();

            System.out.println("what will happen to this line ?");

            obj.dummy(); // NPE

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This code will always gets executed whether exception occurs or not? ");
        }

        try{
            System.out.println("Try Block");
        }
        finally {
            System.out.println("Finally Block");
        }

    }
}