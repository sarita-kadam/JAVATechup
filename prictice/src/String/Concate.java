package String;

public class Concate {

    public static void main(String[] args) {

        /*String s1 = "java";

        s1 = s1.concat(" program");

        System.out.println(s1);*/


        Integer a = 10;
        Integer b = 10;

        System.out.println(a.equals(b));

        System.out.println(a.compareTo(a));  // a == b
        System.out.println(a.compareTo(b));  // a < b
        System.out.println(b.compareTo(a));  // a > b
        System.out.println(a.compareTo(10)); // a == b

       // String s = String.valueOf(10);
        String s1 = "JAVA";
        String s3 = "JAVA";
        String s2 = "java";

        System.out.println(s1.compareTo(s2));
    }
}
