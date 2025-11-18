package Threading;

interface A{

    void test();
    void show();
}


public class ClassImplementsInterface implements A{

    @Override
    public void test() {
        System.out.println("Implemented test method normal way");
    }

    @Override
    public void show() {
        System.out.println("show method");

    }

    public static void main(String[] args) {

        ClassImplementsInterface obj = new ClassImplementsInterface();
        obj.test();
        obj.show();
    }
}

class AnonymousClass{

    public static void main(String[] args) {

        A obj1 = new A() {
            @Override
            public void test() {
                System.out.println("Implemented test method Anonymous Class");
            }

            @Override
            public void show() {
                System.out.println("show method implemented");

            }
        };

        obj1.test();
        obj1.show();
    }
}