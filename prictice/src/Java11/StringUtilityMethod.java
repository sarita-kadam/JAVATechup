package Java11;

public class StringUtilityMethod {

    public static void main(String[] args) {

        //1️.isBlank() : Checks whether a string is empty or contains only whitespace.

        String s1 = "";
        String s2 = "   ";

        System.out.println(s1.isBlank());  // true
        System.out.println(s2.isBlank());  // true

        //2.strip() :  Removes leading and trailing whitespace (Unicode-aware).

        String s = "   Java   ";
        System.out.println(s.strip());


        //3️. lines() : Returns a Stream of lines from a string.

        String data = "Java\nPython\nSpring";
        data.lines()
                .forEach(System.out::println);

        // 4. repeat(int count() : Repeats string multiple times.

        String str = "Java ";
        System.out.println(str.repeat(3));

    }
}
