package ExceptionHandling;

public class IntroductionException {

    public static void main(String[] args) {

        IntroductionException obj = new IntroductionException();
        int result = obj.divide(100,0); // runtime error
        System.out.println("divide " + result);
    }

    int divide(int a, int b){
        int c = a / b;
        return c;
    }
}
