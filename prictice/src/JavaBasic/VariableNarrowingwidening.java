package JavaBasic;

public class VariableNarrowingwidening {

    public static void main(String[] args)
    {
        //byte => short => int => float => long => double
       int a = 9;
       double myDouble = a;

        System.out.println(a);
        System.out.println(myDouble);


//    widening in java process of covert smaller datatype in larger data type

        byte bb = 100;
        short ss = bb;
        int ii = bb;

        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ii);

//    Narrowing in java process of conver larger datatype in larger data using (explicit casting) using ()

        double dd = 90000;
        int iii = (int) dd;
        byte bbb = (byte)dd;

        System.out.println(dd);
        System.out.println(iii);
        System.out.println(bbb);



    }
}
