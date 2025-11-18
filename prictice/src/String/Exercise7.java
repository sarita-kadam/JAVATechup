package String;

//Compare with Char Sequence

public class Exercise7 {

    public static void main(String[] args) {

       String s1 = "java.com", s2 = "Java.com";

       CharSequence cs = "java.com";

        System.out.println("comparing " + s1 + " and " + cs + ": " + s1.contentEquals(cs));

        System.out.println("comparing "+ s2 + " and " + cs + ": " + s2.contentEquals(cs));
    }
}
