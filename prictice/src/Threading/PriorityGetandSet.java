package Threading;

public class PriorityGetandSet extends Thread{

    @Override
    public void run() {

        System.out.println("child thread...");
        System.out.println("Child thread priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        System.out.println("Main thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("Main thread new priority : " + Thread.currentThread().getPriority());

        PriorityGetandSet obj = new PriorityGetandSet();
        obj.start();
    }
}
