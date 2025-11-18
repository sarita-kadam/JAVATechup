package Threading;

public class DigitalClock extends Thread{

    @Override
    public void run() {
        try{

            for (int sec = 1; sec <= 10; sec++){

                System.out.println("Time : " + sec + " seconds");
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
