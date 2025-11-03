package String;

public class StringBufferInsertMethod {

    public static void main(String[] args) {

        //stringBuffer.insert(int index, data);

        StringBuffer s =  new StringBuffer("java");
        s.insert(2,"programming");
        System.out.println(s);

    }
}
