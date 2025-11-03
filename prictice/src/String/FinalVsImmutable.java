package String;

// what is final -> cannot reassign
//what is immutable -> not modifiable object

public class FinalVsImmutable {

    int a = 10;

    public static void main(String[] args) {

        String s1 = "java";
        s1 = s1.toUpperCase(); // JAVA
        System.out.println(s1);

        final String s2 = "java ";
        final int a = 100; // a = 200; error
        System.out.println(a);
        //System.out.println(s2.concat("programming"));

    }
}

