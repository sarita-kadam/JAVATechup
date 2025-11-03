package String;

// intern() = Saves memory by avoiding duplicate strings.

public class InternMethod {

    public static void main(String[] args) {

       String s1 = "saru"; // string literal

        String s2 = new String("saru"); // new object stored in the scp


      //  System.out.println(s1 == s2); // false check reference or memory address

        System.out.println(s1.equals(s2)); // true because of check content

       //String s3 = s2.intern();
       // System.out.println(s1 == s3); // true because both are stored in scp

        //String s2 = "javaprogram";
       // System.out.println(s2.lastIndexOf(""));
    }
}
