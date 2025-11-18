package Threading;

public class SetDaemonIsDaemonMethod extends Thread{

    @Override
    public void run() {

        if(Thread.currentThread().isDaemon())
        {
            System.out.println("daemon thread");
        }
        else
        {
            System.out.println("child thread ...");
        }
    }

    public static void main(String[] args) {

        // Thread.currentThread().setDaemon(true);  //in this throw Exception

        System.out.println("main thread...");

        SetDaemonIsDaemonMethod obj = new SetDaemonIsDaemonMethod();
        obj.setDaemon(true);
        obj.start();


//        obj.start();
//        obj.setDaemon(true); in this throw Exception


    }
}
