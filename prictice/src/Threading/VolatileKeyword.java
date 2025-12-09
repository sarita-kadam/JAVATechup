package Threading;

public class VolatileKeyword extends Thread{

   volatile boolean running = true;

    @Override

    public void run() {

        System.out.println("Thread Started...");

        while (running){

        }

        System.out.println("Thread Stopped...");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        VolatileKeyword t1 = new VolatileKeyword();
        t1.start();

        Thread.sleep(2000);

        t1.running = false;
        System.out.println("Main Thread changed flag to false");
    }
}
