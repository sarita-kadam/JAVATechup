package Inheritance;


interface vehicle{

    void run();
}

class Cars implements  vehicle{

    @Override
    public void run() {
        System.out.println("car is running...");
    }
}

class Bikes implements vehicle{
    @Override
    public void run() {
        System.out.println("Bike is running...");
    }
}

class Bus implements vehicle{

    @Override
    public void run() {
        System.out.println("Bus started...");
    }
}

public class InterfacePractic {

    public static void main(String[] args) {

        vehicle v = new Cars();
        v.run();

        vehicle v1 = new Bikes();
        v1.run();

        Bus b = new Bus();
        b.run();

    }
}

