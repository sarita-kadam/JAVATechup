package Assinment;


public class MyThread extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running...");
        }
    }

    public void stopThread() {
        running = false;  // Immediately visible to other thread
    }

    public static void main(String[] args) {

    }
}
