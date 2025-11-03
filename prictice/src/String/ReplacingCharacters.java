package String;

public class ReplacingCharacters {

    public static void main(String[] args) {

      // replace(char old, char new)

        String s = "sara";

        System.out.println(s.replace('a' ,'i'));

        //replace(CharSequence old, CharSequence new)

        System.out.println(s.replace("ra","ru"));

        System.out.println(s.replace("sara","kadam"));
    }
}
