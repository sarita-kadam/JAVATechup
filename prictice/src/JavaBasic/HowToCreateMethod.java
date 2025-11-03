package JavaBasic;

public class HowToCreateMethod {

    //-	Method is specific tasks write business logic.

    // when method return something, then this last line of that method
    // must be return satetment


    // Note: (do not use keyword as variable,class or method name .)


    //  ***syntax for creating method***

        //syntax1
        //no_return_type methodName(){
        // }
        // in java, when a method does not return anything then we use 'void' keyword


//        void method1 () {
//            System.out.println("method Exampless");
//        }
//
//        void show () {
//            System.out.println("hello");
//        }


         //syntax2
         //no_return_type methodName(parameter list){
         // }


//      void method(int a, long b, char c){
//            System.out.println("this is having 3 parameter");
//
//      }
//
//      void dummy(int aa, long bb, char cc) {
//
//      }

    //syntax 3
    // return_type method(){
    // return statement
    // }

    // but in some case method can return something.
    // => we can use primitive data type and non-primitive data type as a return type.


//    int returnIntvalue(){
//        return 100;
//    }
//
//    boolean returnbooleanvalue(int a,boolean b){
//        return false;
//    }

    //syntax 4
    //return_type methodName(parameter-list){
    // }

    int addition(int a,int b,int c)
    {
             return a + b + c;
    }

    int division(int d,int e)
    {
        return d / e;
    }


    public static void main(String[] args)
    {
        HowToCreateMethod obj = new HowToCreateMethod();

       // obj.addition(10,20,30);
        int result = obj.addition(10,20,30);
//        obj.returnbooleanvalue(10,false);
//        obj.returnIntvalue();
//
        int result1 = obj.division(8,4);
        System.out.println(+result1);

        System.out.println(+ result);



    }
    
}


















