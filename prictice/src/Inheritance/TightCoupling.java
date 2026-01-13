package Inheritance;

//Tight Coupling: When one class directly depends on another concrete class.

class Engines{

    void start(){
        System.out.println("Engine started...");
    }
}

class CAR{

    Engines engines = new Engines(); // direct dependency

    void drive(){
        engines.start();
        System.out.println("Car is Moving...");
    }
}
public class TightCoupling {

}
