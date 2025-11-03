package Constructors;
class parent {
    parent() {
        System.out.println("no-argument");
    }

    parent(int age) {
        System.out.println("1parameterized constructer");
    }

    parent(String name, int age ){
        System.out.println("2 parameterized constructer");
    }
}
public class SuperKeyword extends parent{

    SuperKeyword(){
        super("java",10); // only one constructer call allowed in one constructer
        System.out.println("child class constructer");

    }
    SuperKeyword(int number){
        super(10);
        System.out.println("child class 1 parameter constructer");
    }

    public static void main(String[] args) {

        SuperKeyword obj = new SuperKeyword(10 );

    }
}
