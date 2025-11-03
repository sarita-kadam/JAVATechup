package String;

public class Splitting {

    public static void main(String[] args) {

      //The split() method is used to divide (split) a string into multiple parts (substrings) based on a separator (called a delimiter or regex pattern).
        // It returns all the parts as a String array (String[]).

        String s = " java is programming language";

        String[] arr = s.split(" ");

        for (String word : arr)
        {
            System.out.println(word);
        }
    }
}
