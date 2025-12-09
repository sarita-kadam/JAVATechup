package Threading;

public class DigitalClock extends Thread{

    @Override
    public void run() {
        try{

            for (int i = 1; i <= 10; i ++){

                System.out.println("Time : " + i + " seconds");

                Thread.sleep(1000);
            }
            }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        DigitalClock obj = new DigitalClock();
        obj.start();

    }
    }
