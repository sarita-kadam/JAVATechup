package String;

public class StringBufferMethod {

    public static void main(String[] args) {

        //1. append(String s): Adds the specified string to the end of the current sequence.
        StringBuffer sb = new StringBuffer("java");
        sb.append("program");
        System.out.println();
        System.out.println(sb);

        //2.insert(int offset, String s): Inserts the specified string at the given position
        StringBuffer sb1 = new StringBuffer("java");
        sb1.insert(4,"program");
        System.out.println(sb1);

        //3.replace(int start, int end, String s): Replaces the characters in the specified range with the given string.
        StringBuffer sb2 = new StringBuffer("java program");
        sb2.replace(4,12,"language");
        System.out.println(sb2);

        //4.delete(int start, int end): Removes the characters in the specified range.
        StringBuffer sb3 = new StringBuffer("java program");
        sb3.delete(4,12);
        System.out.println(sb3);

        //5.deleteCharAt(int index) removes the character at a specific position (index) from a StringBuilder or StringBuffer object.
        StringBuffer sb4 = new StringBuffer("java");
        sb4.deleteCharAt(1);
        System.out.println(sb4);

        //6.reverse(): Reverses the sequence of characters.
        StringBuffer sb5 = new StringBuffer("java");
        sb5.reverse();
        System.out.println(sb5);

        //7. capacity(): Returns the current capacity of the buffer.
        StringBuffer sb6 = new StringBuffer("java");
        System.out.println(sb6.capacity());

        //8.setLength(int newLength): Sets the length of the sequence. Truncates or pads with null characters as needed.
        StringBuffer sb7 = new StringBuffer("java");
        sb7.setLength(3);
        System.out.println(sb7);

        //9.charAt(int index): Returns the character at the specified index.
        StringBuffer sb8 = new StringBuffer("java");
        System.out.println(sb8.charAt(1));

        //10. setCharAt(int index, char ch): Sets the character at the specified index.
        StringBuffer sb10 = new StringBuffer("jova");
        sb10.setCharAt(1,'a');
        System.out.println(sb10);

        //11.substring(int start, int end): Returns a substring from the specified range.
        StringBuffer sb11 = new StringBuffer("java program");
        System.out.println(sb11.substring(4,12));

        //12. ensureCapacity(int minimumCapacity): Ensures the capacity is at least the specified value.
        StringBuffer sb12 = new StringBuffer();
        sb12.ensureCapacity(50);
        System.out.println(sb.capacity());


    }
}
