package Threading;

class Earning extends Thread {

    int total = 0;

    @Override
    public void run() {

        for (int i = 1; i <= 10 ; i++) {

            total = total + 100;

            System.out.println(total);

        }
    }
}
public class StaticSychronizedBlock {

    public static void main(String[] args) {

        Earning t1 = new Earning();
        t1.start();

        System.out.println("Total Earning : " + t1.total);

    }
}
