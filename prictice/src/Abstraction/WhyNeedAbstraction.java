
// Abstraction is a hide implementation deatils and show fuctionality.(it provide set of rules)
// we can achieve Abstraction using abstract classes & interface

// Abstract Class = 0 to 100% abstraction.( bcz of in Abstract class have abstract method & non-abstract method)
//Interface = 100% abstraction.( bcz of in interface have ony abstract method )

// Abstraction = What To Do
// Implementation = How To Do

package Abstraction;
// abstract method are those methods does not hava method body.

public class WhyNeedAbstraction {
}

abstract class WhyOfEating{

    abstract void eat(); // abstract method with no body
}

class IndianWayOfEating extends WhyOfEating{
    @Override
    void eat() {
        System.out.println("Indian people use their hand while eating");
    }
}

class WesternWayOfEating extends IndianWayOfEating {
    @Override
    void eat() {
        System.out.println("Western people use spoon while eating");
    }
}

//The hole purpose of abstraction is that some other class
// must “extends” that class and provide method implementation of abstraction class.