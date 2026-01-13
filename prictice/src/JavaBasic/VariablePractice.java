package JavaBasic;

class Var{

    final int c = 10;
       int m = 20;

       static int  s = 11;



    void show(){
        int b = 10;
        b = 20;
    }
}


public class VariablePractice {

    public static void main(String[] args) {
        int a = 10;
        a = 10;

        Var v = new Var();
        v.m= 30; // instance can reassign
      //  v.c = 70; // final can not reassign

       Var.s = 77; // static also reassign
    }
}
