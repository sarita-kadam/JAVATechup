package Threading;

public class ImplementsRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Override run method from Runnable Interface");
    }

    public static void main(String[] args) {

        ImplementsRunnableInterface obj = new ImplementsRunnableInterface();

        Thread th = new Thread(obj);
//      th.start();

        if( th instanceof Thread){
            System.out.println("yes thread is instance of Thread class");
        }

        if(th instanceof Runnable){
            System.out.println("yes thread is instance of Runnable");
        }

        if(obj instanceof Runnable){
            System.out.println("yes obj is instance if Runnable");
        }

    }
}

