package String;

public class StringMethods {

    public static void main(String[] args) {

        // 1. length() = Returns the length of the string
        String name = "saru";
        System.out.println(name.length());


        // 2. charAt(int index)= Returns the character at the specified index
        String s = "java";
        char ch = s.charAt(2);
        System.out.println(ch);

        // 3.equals(String anotherString): Compares two strings for equality
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s2.equals(s3)); // true equals() check content instring
        System.out.println(s2 == s3);      // false == check memory address

        // 4.equalsIgnoreCase(String anotherString): Compares two strings, ignoring case
        String s4 = "java";
        String s5 = new String("JAVA");
        System.out.println(s2.equalsIgnoreCase(s3));

        // 5.compareTo(String anotherString): Compares two strings
        String s6 = "SARU";
        String s7 = "SARU";
        System.out.println(s6.compareTo(s7));

        // 6. indexOf(String str): Returns the index of the first occurrence of the substring
        String s8 = "java program";
        System.out.println(s8.indexOf('p'));
        System.out.println(s8.lastIndexOf("r"));

        // 7.toUpperCase(): Converts the string to uppercase,toLowerCase(): Converts the string to lowercase.
        String s9 = "sarita";
        String s10 = "SARITA";
        System.out.println(s9.toUpperCase());
        System.out.println(s10.toLowerCase());

        // 8. trim(): Removes starting and ending spaces.
        String s11 = " sarita kadam ";
        System.out.println(s11.trim());

        // 9. replace() : Replaces all occurrences of a character or substring with another.
        String s12 = "java is easy language";
        System.out.println(s12.replace("java","CSS"));

        //10.replaceFirst() : Replaces only the first occurrence of the matching substring.
        String s13 = "java is easy language";
        System.out.println(s13.replaceFirst("java","javascript"));

        // 11. replaceAll() : Replaces all occurrences that match a regular expression (regex) pattern.
        String s14 = "java is easy to learn";
        System.out.println(s14.replaceAll("java","HTML"));

        // 12.split(String regex): Splits the string into an array based on a regex.
        String s15 = "java is very easy";
        String[] result = s15.split("");
        System.out.println("result = ");
        for (String str : result){
            System.out.println(str + " ");
        }

        // 13. valueOf(Object obj): Converts an object to a string
        int a = 10;
        String s16 = String.valueOf(a);
        System.out.println(s16 + 10); // Concatenation, not addition 1010

        // 14. toCharArray(): Converts the string to a character array.
        String str1 = "JAVA";
        char[] array = str1.toCharArray();
        for (char c : array){
            System.out.println(c);
        }

        //15.substring(int beginIndex): extract part of a string (from one index to another).It returns a new String.
        //beginIndex -> starting position , endIndex -> ending position

        String str2 = "java program";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5));

        //16.subSequence() also extracts a portion of a string but it returns a CharSequence, not a String.

        String str = "javaprogram";
        System.out.println(str.subSequence(0,5));


    }
}
