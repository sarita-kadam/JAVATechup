package String;

public class Substring {
    public static void main(String[] args) {

        //substring(int beginIndex)

        String s = "programming";
        System.out.println(s.substring(3));

        //substring(int beginIndex, int endIndex)

        System.out.println(s.substring(0,6));

        //subsequence(return charsequence belongs to charsequence interface

        System.out.println(s.subSequence(3,7));
    }
}
