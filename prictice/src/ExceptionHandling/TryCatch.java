package ExceptionHandling;

public class TryCatch {

    public static void main(String[] args) {

        try
        {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println(e);

            try{
                int a = 100 / 10;

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("this is finally block");

            try{
                System.out.println("try in finally");
            }
            catch (Exception e) {
                System.out.println("this is catch block inside finally with try");
            }
        }
    }
}

