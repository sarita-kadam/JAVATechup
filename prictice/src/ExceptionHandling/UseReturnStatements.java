package ExceptionHandling;

public class UseReturnStatements {

    public static void main(String[] args) {

        UseReturnStatements obj = new UseReturnStatements();
        System.out.println(obj.show());
    }

    int show(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 2;
        }
    }
}
