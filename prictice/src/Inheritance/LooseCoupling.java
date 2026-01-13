package Inheritance;

//LooseCoupling : when classes depend on abstraction(interface or abstract class) instead of concrete classes
//Easy to change and extend

interface Enginess{
    void start();

}
class PetrolEngine implements Enginess{

    @Override
    public void start() {
        System.out.println("petrol Engine started..");
    }
}
class ElectricEngine implements Enginess{

    @Override
    public void start() {
        System.out.println("Electric Engine started..");
    }
}

class Carss{

    Enginess engine;

    Carss(Enginess engine){
        this.engine = engine;
    }

    void drive(){
        engine.start();
        System.out.println("Car is Moving...");
    }
}
public class LooseCoupling {

    public static void main(String[] args) {

        Enginess engine = new ElectricEngine();

        Carss car = new Carss(engine);
        car.drive();
    }
}
