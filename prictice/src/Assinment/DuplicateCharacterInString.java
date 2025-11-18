package Assinment;

public class DuplicateCharacterInString {

    public static void main(String[] args) {

        String str = "programming";

        char[] chars = str.toCharArray();

        System.out.println("Original String is::"+str);

        for (int i = 0; i <= chars.length -1; i++) {

            for (int j = i + 1 ; j <= chars.length -1; j++) {

                if (chars[i] == chars[j]){

                    System.out.println("Duplicate Character is::"+chars[j]);
                }

            }

        }

    }
}



