package Threading;

class  Medical extends Thread{

    @Override
    public void run() {

        try{

            System.out.println("Medical start...");

            Thread.sleep(1000);

            System.out.println("Medical Completed");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TestDriver extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Test drive Starts...");

            Thread.sleep(1000);

            System.out.println("Test drive Completed");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Officer take the file...");
            Thread.sleep(1000);
            System.out.println("officer completed work");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class LicenceDemo {

    public static void main(String[] args) throws InterruptedException {

        Medical m = new Medical();
        m.start();
        m.join();

        TestDriver t = new TestDriver();
        t.start();
        t.join();

        OfficerSign o = new OfficerSign();
        o.start();
        o.join();




    }
}
