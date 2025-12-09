package Threading;

//Anonymous Classes : When we need a class only ONE time ,To make code shorter and cleaner

interface AA{
    void test();

}

public class TestAnonymous {

    public static void main(String[] args) {

        AA obj = new AA() {
            @Override
            public void test() {
                System.out.println("show method of AA interface");
            }
        };

        obj.test();
    }

}
