package String;

// intern() = Saves memory by avoiding duplicate strings.

public class InternMethod {

    public static void main(String[] args) {

         String s1 = new String("saru");
         String s2 = "saru";
         String s3 = s1.intern();


        System.out.println(s1 == s2);      // false → different memory
        System.out.println(s1.equals(s2)); //true → same content
        System.out.println(s3 == s2);      //true → both in string pool

    }
}
