package Threading;


class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }
}
public class Test1 {
    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        t1.start();

        Mythread t2 = new Mythread();
        t2.start();

    }
}
