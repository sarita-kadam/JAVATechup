package Threading;

public class SleepMethod extends Thread{

    private String threadname;

    SleepMethod(String name){
        threadname = name;
    }

    @Override
    public void run() {
        try{

            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i + ": " + Thread.currentThread().getName());

                Thread.sleep(1000); // Pausing thread for 1 second (1000 milliseconds)
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        SleepMethod obj = new SleepMethod("thread-1");
        obj.start();

        SleepMethod obj1 = new SleepMethod("thread-1");
        obj1.start();


    }
}
