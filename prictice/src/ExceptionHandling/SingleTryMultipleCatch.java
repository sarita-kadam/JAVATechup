package ExceptionHandling;

public class SingleTryMultipleCatch {

    public static void main(String[] args) {

        try{
            int a = 100 /10;
            int[] arr = new int[10];
            arr[1] = 100;

            SingleTryMultipleCatch obj = new SingleTryMultipleCatch();

            System.out.println("what will happen to this line ? ");
            obj.dummy();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NullPointerException  e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException ){
            System.out.println("Got ArrayIndexOutOfBoundsException ");
        }

        System.out.println("Hello Java");
    }

    void dummy(){
        System.out.println("dummy method");
    }
}
