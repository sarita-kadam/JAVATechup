package Abstraction;

import java.io.Serializable;

//Marker interface = empty interface
//Used to give special permission/info
//JVM behaves differently when it finds marker : Examples: Serializable, Cloneable
class MarkerDemo implements Serializable {

}

public class MarkerInterface {

    public static void main(String[] args) {

        MarkerDemo obj = new MarkerDemo();


        if (obj instanceof MarkerDemo ){
            System.out.println("Marker interface found");
        }else {
            System.out.println("Marker interface not found");
        }
    }
}
