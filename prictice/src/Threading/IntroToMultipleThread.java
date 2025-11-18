package Threading;

public class IntroToMultipleThread  extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Task..." + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        IntroToMultipleThread thread1 = new IntroToMultipleThread();
        thread1.setName("Dummy Thread1");
        thread1.start();

        IntroToMultipleThread thread2 = new IntroToMultipleThread();
        thread2.setName("Dummy Thread2");
        thread2.start();



    }
}
