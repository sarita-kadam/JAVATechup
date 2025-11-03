package String;

public class StringCreationWays {

    public static void main(String[] args) {

        String s1 = new String("java"); // using new keyword
        String s2 = new String("java");

        String s3 = "java";                   // string literals (better memory managment)
        String s4 = "java";

        String s5 = s4.concat(" programme");
        s5.concat("programme");
        s5 = s5.concat(" language");

//        System.out.println(s1 == s2); // Different heap objects false
//        System.out.println(s3 == s4); // true Same object from String Pool
//        System.out.println(s1 == s3); // false One in heap, one in pool

        System.out.println(s5);
    }
    }

