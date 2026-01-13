package String;

public class StringReverse {

    public static void main(String[] args) {

        String s = "sara"; //This is the original string that we want to reverse.

        String rev = "";  //This variable will store the reversed string.

        for (int i = s.length()-1; i >= 0; i--){

            rev =  rev + s.charAt(i); //s.charAt(i) → gets the character at index i

        }

        System.out.println(rev);


             // OR


        String str = "java";   //This is the original string that we want to reverse.

        char[] arr = str.toCharArray(); // converts the string into a character array.

        for (int i = str.length() -1; i >= 0; i--){

            System.out.print(arr[i]); //arr[i] fetches the character at index i from the array.
        }
    }
}
