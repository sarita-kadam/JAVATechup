package JavaBasic;

class instanceVariable{

    int b = 20;  // instance variables



    static int c = 30; // static variables

    static {
        System.out.println(c); // only allow static inside static block

    }

    {
        System.out.println(b); // instance variables
        System.out.println(c); //static variables
    }

    void show(){
        int a = 10; // local variable
        System.out.println(a);
        System.out.println(b); //instance variables
        System.out.println(c); // static variables
    }

    static void add(){

        System.out.println(c); // only allow static

        instanceVariable n = new instanceVariable();
        System.out.println(instanceVariable.c); // we can access static variables  inside the instance method creating object
    }

    void dummy(){
        final  int n = 44; //  can make local variable as final

    }
}

public class Variables {

    public static void main(String[] args) {


        instanceVariable obj = new instanceVariable();
        obj.show();

        System.out.println(instanceVariable.c); // static



    }
}
