package ExceptionHandling;

public class StaticBlock {

    static {
        try{
            throw new Exception("checked exception in static block");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
