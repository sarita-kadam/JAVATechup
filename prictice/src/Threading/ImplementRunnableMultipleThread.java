package Threading;

public class ImplementRunnableMultipleThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Run Method " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ImplementRunnableMultipleThread obj = new ImplementRunnableMultipleThread();

        Thread thread1 = new Thread(obj);
        thread1.setName("Thread0000");
        thread1.start();

        Thread thread2 = new Thread(obj);
        thread2.setName("Thread1111");
        thread2.start();

        Thread thread3 = new Thread(obj);
        thread3.setName("Thread2222");
        thread3.start();


        thread3.setPriority(10);

        //OS scheduler round robin principle

        // data inconsistency

        //Synchronization

    }
}
