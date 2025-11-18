package String;

//Compare with StringBuffer

public class Exercise8 {

    public static void main(String[] args) {

       String s1 = "java.com" ,s2 = "Java.com";

       StringBuffer sb = new StringBuffer(s1);

        System.out.println("comparing " + s1 + " and " + sb + " : " + s1.contentEquals(sb));
        System.out.println("comparing " + s2 + " and " + sb + " : " + s2.contentEquals(sb));

    }
}
