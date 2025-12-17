package Static;



public class Ex {

    static int a = 10;
    int b = 20;

    void show(){
        System.out.println("Instance method");
        System.out.println(a);
        System.out.println(b);
    }

    static void test(){

        Ex e = new Ex();
        System.out.println("Static method");

        System.out.println(a);
        System.out.println(e.b);
    }
    public static void main(String[] args) {


       Ex e = new Ex();
       e.show();
       test();

    }
}
