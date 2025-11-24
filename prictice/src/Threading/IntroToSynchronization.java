package Threading;

public class IntroToSynchronization implements Runnable{


    @Override
    public void run() {

        synchronized (this){

            try{
                for (int i =0; i < 3; i++){

                    System.out.println("Thread Name is " + Thread.currentThread().getName() + " With index value " + i);
                }

                Thread.sleep(4000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

       // System.out.println("Test message " + Thread.currentThread().getName());
        System.out.println("Test message " + Thread.currentThread().getName());

    }

    public static void main(String[] args) throws InterruptedException {

        IntroToSynchronization obj1 = new IntroToSynchronization();
        IntroToSynchronization obj2 = new IntroToSynchronization();
        IntroToSynchronization obj3 = new IntroToSynchronization();

        //multiple threads sharing same resource  => synchronized worked properly

        //multiple threads but each having its own resource  => synchronized does not work properly


        Thread t1 = new Thread(obj1);
        t1.setName("sara");
        t1.start();
        t1.join();

        Thread t2 = new Thread(obj2);
        t2.setName("riya");
        t2.start();
        t2.join();

        Thread t3 = new Thread(obj3);
        t3.setName("riva");
        t3.start();
        t3.join();
    }


}
