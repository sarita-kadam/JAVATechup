package String;

public class StringBufferBuilder {

    public static void main(String[] args) {


        // string
//        String name = "saru";
//        name.concat("kadam");
//        System.out.println(name); // immutable


        // stringBuffer
//        StringBuffer s = new StringBuffer("saru ");
//        s.append("kadam");
//        System.out.println(s); // mutable


        // stringBuilder
        StringBuilder obj = new StringBuilder("saru ");
        System.out.println(obj.capacity()); // mutable

//

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());

//        sb.append("saru");
//        System.out.println(sb.capacity());

//        sb.append("sarita kadam");
//        System.out.println(sb.capacity());

    }
}
