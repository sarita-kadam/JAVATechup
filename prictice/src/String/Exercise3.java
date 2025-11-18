package String;

// Lexicographical String Comparison

public class Exercise3 {

    public static void main(String[] args) {

        String str = "java";
        String str1 = "java 1";

        int result = str.compareTo(str1);

        if(result < 0){
            System.out.println(str + " is less than " + str1);
        }
        else if (result == 0) {
            System.out.println(str + " is equals to "+str1);

        }
        else { // if (result > 0)
            System.out.println(str + " is greater than " + str1);
        }

       // System.out.println(result);
    }
}


// value1 ==  value2 : 0
// value1 >   value2 : positive +
// value1 <   value2 : negative -

// compare with there ascii value