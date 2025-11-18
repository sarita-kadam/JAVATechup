package Threading;

public class YieldMethod extends Thread{


    @Override
    public void run() {

        for (int i = 1 ; i <= 5; i++ ){

          //  Thread.yield();
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {

        YieldMethod obj = new YieldMethod();
        obj.start();

        Thread.yield(); //if you want main method to stop and provide chance to other threads for execute

        for (int i = 1; i <=4; i++){
            System.out.println( " Main Thread " + i);
        }
    }
}
