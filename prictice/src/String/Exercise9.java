package String;

//String from Character Array

public class Exercise9 {

    public static void main(String[] args) {

        char[] arr = new char[]{'1','2','3','4','5'};

        String s1 = String.copyValueOf(arr,1,3);

        System.out.println(" The book contains " + s1 + " pages ");

    }
}

//  syntax : String.copyValueOf(char[] data, int offset, int count)

// data -> character array : {'1','2','3','4','5'};
// offset -> index start : 1 means 2
// count -> how many character take : 3 means 3 character