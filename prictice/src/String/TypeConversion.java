package String;

public class TypeConversion {

    //toCharArray()

    public static void main(String[] args) {

        String s = "java";

        char[] arr = s.toCharArray();

//        for (char c : arr)
//        {
//            System.out.println(c);
//        }



        //valueOf() = Converts any type to String.

        int num = 10;

        String s1 = String.valueOf(num);

        System.out.println(s1);
    }
}
