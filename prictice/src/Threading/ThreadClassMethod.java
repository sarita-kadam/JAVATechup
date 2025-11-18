package Threading;


public class ThreadClassMethod extends Thread{

    @Override
    public void run() {

       // Thread.currentThread().setName("java"); // set name of your Thread
        System.out.println(Thread.currentThread().getName()); // get name of your Thread when you set
        System.out.println("Thread Task...");
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        ThreadClassMethod t = new ThreadClassMethod();
        t.setName("programme"); // you also set name in here
        t.start();

    }
}
