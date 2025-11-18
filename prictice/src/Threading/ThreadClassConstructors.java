package Threading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadClassConstructors {

    public static void main(String[] args) {

        Thread t1 = new Thread(); // default constructor
        Thread t2 = new Thread("sarita"); //named thread
        Thread t3 = new Thread(new MyRunnable()); // Runnable target
        Thread t4 = new Thread(new MyRunnable(),"sarita"); //  Target + name


    }
}
