package ExceptionHandling;

public class StringReverseWay {

    public static void main(String[] args) {

        //1. Using charAt() Method

//        String s = "java";
//
//        String rev = "";
//
//        for (int i = s.length() - 1; i >= 0; i--){
//            rev = rev + s.charAt(i);
//        }
//
//        System.out.println(rev);


        // 2.Using toCharArray() method

//        String s1 = "java";
//
//        char[] arr = s1.toCharArray();
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//
//            System.out.print(arr[i]);
//
//        }


        // 3.Using stringBuilder

        String str = "java";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());

        //4. Using Recursion




    }
}
