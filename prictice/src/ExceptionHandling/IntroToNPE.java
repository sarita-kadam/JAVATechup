package ExceptionHandling;

//NullPointerException

public class IntroToNPE {

    public static void main(String[] args) {

        IntroToNPE obj = new IntroToNPE();
        obj.show();

    }

    //Thread dump
    //Heap dump

    void show(){

        System.out.println("show method ");

        IntroToNPE obj1 = new IntroToNPE();

        IntroToNPE obj2 = null;

        test(obj2);
    }

    void test(IntroToNPE obj2){

        obj2 = null;

        obj2.dummy();

    }

    void dummy(){

    }
}
