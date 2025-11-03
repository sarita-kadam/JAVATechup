package String;

public class StringBufferDelete {

    public static void main(String[] args) {

        //stringBuffer.delete(int start, int end);

        StringBuffer s = new StringBuffer("hellomyjava");
        s.delete(5,7);
        System.out.println(s);
    }
}

