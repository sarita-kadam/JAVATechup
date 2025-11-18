package String;

//Get Unicode Code Point at Index

public class Exercise2 {

    public static void main(String[] args) {

        String str = "sarita.com";
        System.out.println(str);

        int value1 = str.codePointAt(1);
        int value2 = str.codePointAt(7);

        // Retrieve the Unicode code point before the character at index 1 in the string.
        int value3 = str.codePointBefore(1);
        int value4 = str.codePointBefore(7);

        // Count the number of Unicode code points from index 1 to index 10 in the string.
        int value5 = str.codePointCount(1,4);

        System.out.println(value1);
        System.out.println(value2);

        System.out.println(value3);
        System.out.println(value4);

        System.out.println(value5);
    }

}

