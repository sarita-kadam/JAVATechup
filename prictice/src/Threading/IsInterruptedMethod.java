package Threading;

public class IsInterruptedMethod extends Thread{

    @Override
    public void run() {

       // System.out.println("A : " + Thread.interrupted()); // true -> false change status
       // System.out.println("A : " + Thread.interrupted());

        System.out.println("B2 : " + Thread.currentThread().isInterrupted());// true -> true
        System.out.println("B1 : "+ Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++){
                System.out.println(i);
                Thread.sleep(1000);
             //   System.out.println("B : " + Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted " + e);
        }
    }

    public static void main(String[] args) {

        IsInterruptedMethod obj = new IsInterruptedMethod();
        obj.start();
        obj.interrupt();


    }
}
