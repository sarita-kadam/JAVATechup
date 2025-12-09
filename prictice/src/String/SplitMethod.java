package String;

public class SplitMethod {

    public static void main(String[] args) {

        String s = "java is easy";

        String[] words = s.split(" ");

        for (String w : words){
            System.out.println(w);
        }


        String s1 = "Apple,Banana,Orange";

        String[] fruits  = s1.split(",");

        for(String f : fruits){
            System.out.println(f);
        }

        int[] num = {10,20,30};

        for (int n : num){
            System.out.println(n);
        }

    }

}
