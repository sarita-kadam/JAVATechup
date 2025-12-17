package Threading;

public class Test  extends Thread{

    @Override
    public void run() {
        System.out.println("main thread" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

       Test obj = new Test();
       // obj.run();
       obj.start();

        Test obj1 = new Test();
        //obj1.run();
        obj1.start();
    }
}
