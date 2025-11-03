package String;

public class CheckingEmptyorBlank {

    public static void main(String[] args) {

        //isEmpty() & isBlank() (Java 11+)

        String s1 = "";
        String s2 = " ";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
    }
}
