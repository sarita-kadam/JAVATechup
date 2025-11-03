package String;

public class ReverseString {

    public static void main(String[] args) {

        String s = "sarita";

        StringBuilder ss = new StringBuilder();
        for (int i = s.length()-1; i >= 0 ; i--) {

            ss.append(s.charAt(i));

        }
        System.out.println(ss);
    }
}
