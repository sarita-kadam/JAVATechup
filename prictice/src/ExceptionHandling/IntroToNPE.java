package ExceptionHandling;

//NullPointerException

public class IntroToNPE {

    public static void main(String[] args) {

        IntroToNPE obj = new IntroToNPE();
        obj.show();

    }

    // Thread dump
    //Heap dump

    void show(){
        System.out.println("show method ");
        IntroToNPE obj1 = new IntroToNPE();
        IntroToNPE npe = null;
        test(npe);
    }

    void test(IntroToNPE npe){
        npe = null;
        npe.dummy();

    }

    void dummy(){

    }
}
