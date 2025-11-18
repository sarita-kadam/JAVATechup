package Threading;

public class JoinMethod extends Thread{

     static Thread mainthread;

    @Override
    public void run() {

        try{
            mainthread.join();  // Child thread waits for main thread to complete main thread execution

            for (int i = 1; i <= 5; i++){
                System.out.println("Child Thread "+ i);
                Thread.sleep(1000);

            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

         mainthread = Thread.currentThread();

        JoinMethod obj = new JoinMethod();
        obj.start();
        //obj.join();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
                obj.join();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
