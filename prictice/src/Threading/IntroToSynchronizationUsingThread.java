package Threading;

public class IntroToSynchronizationUsingThread extends Thread {

    @Override
    public synchronized void run() {

        for (int i = 0; i < 3; i++) {

            System.out.println("Thread Name is : " + Thread.currentThread().getName());

            /*try {
                sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }*/
        }
        System.out.println("massage out of synchronized" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        IntroToSynchronizationUsingThread t1 = new IntroToSynchronizationUsingThread();
        t1.setName("Sara");
        t1.start();

        IntroToSynchronizationUsingThread t2 = new IntroToSynchronizationUsingThread();
        t2.setName("Riya");
        t2.start();

        IntroToSynchronizationUsingThread t3 = new IntroToSynchronizationUsingThread();
        t3.setName("Saru");
        t3.start();
    }
}