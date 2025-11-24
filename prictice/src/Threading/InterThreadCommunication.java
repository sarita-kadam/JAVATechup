package Threading;

// Object Class Method : wait(),notify(),notify(). used only with synchronized block


class TotalEarning extends Thread {

    int total = 0;

    @Override
    public void run()
    {

        synchronized (this){

         for (int i = 1; i <= 10; i++) {

             total = total + 100;

           //  System.out.println(total);

         }

         this.notify();
      }

    }
}

class MyThread extends Thread{

    TotalEarning b;

    @Override
    public void run() {
        b.run();
    }
}
public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {


        TotalEarning t = new TotalEarning();
        t.start();

     //   System.out.println("Total Earning: " + t.total + "rs");

        synchronized (t){
            t.wait(1000);
            System.out.println("Total Earning: " + t.total + "rs");
        }
    }
}
