package Threading;

interface ABCD{

    void add(int a, int b);
    void sub(int a,int b);
}

public class Anonymousclasses {

    public static void main(String[] args) {

        ABCD abcd = new ABCD() {
            @Override
            public void add(int a, int b) {
                int result = a + b;
                System.out.println(result);
            }

            @Override
            public void sub(int a, int b) {

            }
        };

        abcd.add(10,21);
    }
}
