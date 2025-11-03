package Constructors;


class ThisParent{
    ThisParent(){
        System.out.println("no-argument constructer of parent class");
    }

    ThisParent(int age){
        System.out.println("1 - arg constructer of parent class");
    }
}

public class ThisKeyword extends ThisParent {

    ThisKeyword() {
        this(10,"python"); // call same  class 2-argument
        System.out.println("no-argument constructer");
    }

    ThisKeyword(int age, String name) {
        super(100);
        System.out.println("2 parameter constructer");

    }

    ThisKeyword(int age, String name, boolean t) {
        this(); // call same no-argument constructer

        System.out.println("3 parameter constructer");
    }


    public static void main(String[] args) {

        //ThisKeyword obj = new ThisKeyword(10,"java");


       ThisKeyword obj2 = new ThisKeyword(20,"python",true);

        //ThisKeyword obj3 = new ThisKeyword();


    }

}