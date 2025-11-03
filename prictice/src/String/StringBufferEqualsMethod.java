package String;

public class StringBufferEqualsMethod {

    // in stringBuffer equals() method check reference  (not content)

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("java");
        StringBuffer s1 = new StringBuffer("java");

        System.out.println(s.equals(s1));
        System.out.println(s.capacity());



    }
}
