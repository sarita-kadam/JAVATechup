package Threading;

public class YieldMethod extends Thread{


    @Override
   synchronized public void run() {

       /* for (int i = 1 ; i <= 5; i++ ){
            //  Thread.yield();
            System.out.println(Thread.currentThread().getName() + " " + i);
        }*/
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Thread.currentThread().getName();

        YieldMethod obj = new YieldMethod();
        obj.setName("Main thread");
        obj.start();


        YieldMethod obj1 = new YieldMethod();
        obj1.setName("Threda 1");
        obj1.start();
        obj1.setPriority(10);
        Thread.yield(); //if you want main method to stop and provide chance to other threads for execute


        YieldMethod obj2 = new YieldMethod();
        obj2.setName("Thread 2");
        obj2.start();
        obj2.setPriority(10);

        YieldMethod obj3 = new YieldMethod();
        obj3.setName("Thread 3");
        obj3.start();

        YieldMethod obj4 = new YieldMethod();
        obj4.setName("Thread 4");
        obj4.start();
    }
}
