package Constructors;

public class EXConstructers {

    EXConstructers(){
        System.out.println("Default constructer / No-Argument constructer");
    }

    public EXConstructers(int age, String name){
        System.out.println("2 Argument constructer / parameterized constructer");

    }

    public EXConstructers(int a , int b , int c){
        System.out.println("3 parameterized constructer");
    }


    public static void main(String[] args) {

        EXConstructers obj = new EXConstructers();

        EXConstructers obj1 = new EXConstructers(10,"saru");

        EXConstructers obj2 = new EXConstructers(11,22,33);
    }
}
