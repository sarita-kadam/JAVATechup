package Inheritance;

class Engine{

    void start(){

        System.out.println("Engine start");
    }
}

class Car {

    Engine obj = new Engine();

    void drive(){
        obj.start();
        System.out.println("Car is Running");
    }

}

public class HASaRealationship {

    public static void main(String[] args) {

        Car c = new Car();
        c.drive();

    }
}
