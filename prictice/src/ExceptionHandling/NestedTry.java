package ExceptionHandling;

public class NestedTry {

    public static void main(String[] args) {

        try{

            try{
                int a = 10/0;
            } catch (ArithmeticException e){
                System.out.println("Inner catch");
            }


            try{
                int[] arr = new int[2];
                System.out.println(arr[5]);
            }catch (ArrayIndexOutOfBoundsException ee){
                System.out.println("Innermost catch");
            }


        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
