package String;

//Contains Specified Sequence

public class Exercise6 {

    public static void main(String[] args) {

        String s1 = "java and HTML";
        String s2 = "is"; // false
        String s3 = "and"; //true

        System.out.println(s1.contains(s2));

    }
}

//The contains() method in Java’s String class is used to check whether a specific sequence of characters (substring) exists inside another string.
// Return Type : boolean
// true → if the substring is found
// false → if the substring is not found