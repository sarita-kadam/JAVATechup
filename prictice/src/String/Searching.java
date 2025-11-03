package String;

//indexOf() and lastIndexOf()

public class Searching {

    public static void main(String[] args) {

        String s = "programming";

        System.out.println(s.indexOf('g'));
        System.out.println(s.lastIndexOf('n'));

        // contains(CharSequence seq)
        //true → if the substring exists
        //false → if it does not exist

        System.out.println(s.contains("java"));

        // startsWith() & endsWith()

        System.out.println(s.startsWith("pro"));
        System.out.println(s.endsWith("gram"));
    }
}



