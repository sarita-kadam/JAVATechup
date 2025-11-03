package Constructors;

class constructer {
   constructer(){
        System.out.println("multilevel constructer");
    }

}
class Constructerparent extends constructer{
    Constructerparent(){
        System.out.println("parent class no-argument constructer");
    }

    Constructerparent(String a, String b){

        System.out.println(" child class paramertrized constructer");

    }
}
public class ConstructerChaining extends Constructerparent  {
    ConstructerChaining(){
        System.out.println("constructer chaining class");
    }

    ConstructerChaining(int age){
        super(); // THis line will added by JVM
        System.out.println("costructer chaining parameterized class");
    }

    public static void main(String[] args) {

        ConstructerChaining obj = new ConstructerChaining(10);


    }
}
