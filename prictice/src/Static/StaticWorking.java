package Static;

public class StaticWorking {

    static int staticvar = 100;
    int instancevr = 300;

    public static void main(String[] args) {

        StaticWorking obj1= new StaticWorking();

        StaticWorking obj2 = new StaticWorking();

        obj2.staticvar = 401;

        StaticWorking obj3 = new StaticWorking();

        obj3.staticvar = 501;


        System.out.println("instance = " +obj1.instancevr +  " static = "  + obj1.staticvar);

        System.out.println("instance = " + obj2.instancevr +  " static = " + obj2.staticvar);

        System.out.println("instance = " + obj3.instancevr +  " statcic = " + obj3.staticvar);


        obj1.instancevr = 301;
        obj1.staticvar = 101;

        obj2.instancevr = 302;
        obj2.staticvar = 102;

        obj3.instancevr = 303;
        obj3.staticvar = 103;


        System.out.println("instance = " +obj1.instancevr +  " static = "  + obj1.staticvar);

        System.out.println("instance = " + obj2.instancevr +  " static = " + obj2.staticvar);

        System.out.println("instance = " + obj3.instancevr +  " statcic = " + obj3.staticvar);

    }
}

// static  Ex. = SBH(state bank of hedrabad) => SBI(state bank of india) (update static value)
