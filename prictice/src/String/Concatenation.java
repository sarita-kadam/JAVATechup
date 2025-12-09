package String;

public class Concatenation {

    public static void main(String[] args) {

        String s = "ABC";
        s = s.concat("EFG");
        System.out.println(s); // ABCEFG

        String s1 = "XYZ";
        s1 = s.concat("PQR"); // a refer to a + pqr ABCEFGPQR
        System.out.println(s1);

        s1 = s1 + 'j' + "a";
        System.out.println(s1); // ABCEFGPQRjs

        s1 = 'j'+ s1 + "a";
        System.out.println(s1); //jABCEFGPQRjss

        s1 = 'j'+'k'+"a"; //char + char → ASCII addition first
        System.out.println(s1); // 106 + 107 = 213s

        s1 = 10 + 20 + "d";
        System.out.println(s1); //30d

        s1 = 10 + 'f' + "f";
        System.out.println(s1); //10 +102 +f = 112f

        s1 = 'k' +"d"; //char + String → String concatenation
        System.out.println(s1);

        s1 = "d" + 'k';
        System.out.println(s1);

        System.out.println('g' + 10 + "java"); // 103 + 10 +java = 113java

        System.out.println('g' +'h' + "java" + 'j');

        System.out.println('a' + "java" + 10 + 'j'); //sjava10j

        System.out.println("java" + 10/2);

        System.out.println('a' + 'a' + "saru");
        System.out.println('a' + "saru" + 'a');


        String a = "sarita";
        String b = "kadam";
        System.out.println(a + b);
        System.out.println(a + 10 + b);
        System.out.println(10 + a + b);
        System.out.println(a + 10 % 10);
        System.out.println(-1 + a);
        System.out.println(10 * 2 + a);
        System.out.println(10 + 20 + a);
        System.out.println(10 / 2 + a);
        //  System.out.println(a +10 -2); // error
        System.out.println(a + 2 + b);


      //  System.out.println(null + 1 + "java"); compile time error

        String ss = "java";
        String sss = "java";
        String s3 = new String("java");
        System.out.println(ss.equals(s3)); // true
        System.out.println(ss == s3);



    }
}
