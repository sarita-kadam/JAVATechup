package String;

// whenever we use "new" keyword for creating a string object
// it will always return a new object

public class EqualMethodVsOperators {

    public static void main(String[] args) {

//        String name = "saru"; // scp (constant value)
//        String name1 = "saru";
//        String name2 = new String("saru"); // stored in heap "new"
//
//        System.out.println(name == name1);
//        System.out.println(name == name2);// == check memory address
//        System.out.println(name.equals(name2)); // equals() content check

        String s1 = new String("java");

        String s2 = "java";

        System.out.println(s1 == s2); // scp

        System.out.println(s1.equals(s2)); // Heap

        StringBuilder s3 = new StringBuilder("java");
        StringBuilder s4 = new StringBuilder("java");

        System.out.println(s3.equals(s4));

    }
}


// = =        : check the memory location or address
// equals();  : check content of object