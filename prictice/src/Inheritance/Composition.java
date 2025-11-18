package Inheritance;

//Composition(Strong):  The contained object cannot exist without the container.
//Example : A Car has an Engine. If Car is destroyed, Engine also is.



class Enginee {

    void start(){
        System.out.println("Engine started...");
    }

}

// Car class has-a Engine

class Carr{

    private Enginee enginee; //Has - a -relationship

    //Constructer

    public Carr(){
        enginee = new Enginee(); //composition
    }

    void drive(){
        enginee.start();
        System.out.println("Car is  Running...");
    }
}

public class Composition {

    public static void main(String[] args) {

        Carr obj = new Carr();
        obj.drive();
    }
}
