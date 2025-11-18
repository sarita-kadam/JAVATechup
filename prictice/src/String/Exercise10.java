package String;

//Ends With Substring

public class Exercise10 {

    public static void main(String[] args) {

        String s1 = "java programming language";
        String s2 = "java programming languages";

        String end_str = "es";

        boolean end1 = s1.endsWith(end_str);
        boolean end2 = s2.endsWith(end_str);

        System.out.println(s1 + " end with " + end_str + " " + end1);
        System.out.println(s2 + " ends with " + end_str + " " + end2);

    }
}
