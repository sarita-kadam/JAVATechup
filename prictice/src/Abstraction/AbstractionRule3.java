package Abstraction;

public class AbstractionRule3 {

}

// Rule3.We can not create an object of abstract class. but we can create constructer of that abstract class

abstract class Rule3{

    int a;
    String name;

    public Rule3(){    // constructer used when variable parsent in abstract class
        System.out.println("this is constructer of class");
    }

    public static void main(String[] args) {

        AbstractionRule3 obj = new AbstractionRule3();
        // Rule3 obj2 = new Rule3();  ( Used rule 3 then get error when u create object og astract class )


    }
}



 // Q.1 can create object in abstract class ? = No
//  Q.2 can abstract class have constructer in java ? = Yes
// Q.3  Why we need constructer in abstract class ? = when variable parsent in abstract class will get default value