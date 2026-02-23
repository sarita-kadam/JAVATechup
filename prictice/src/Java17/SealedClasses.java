package Java17;


//1. Sealed Classes : Restrict which classes can extend or implement a class.

sealed class Vehicle permits Car, Bike, Truck {

}

final class Car extends Vehicle {}
final class Bike extends Vehicle {}
final class Truck extends Vehicle {}


// class Helicopter extends  Vehicle{}   //Not allowed

public class SealedClasses {

    public static void main(String[] args) {





    }
}
